"""
docu_reader.py
A document-based QA agent using Mistral AI's SDK.
Supports .txt, .pdf, and image files (via Mistral OCR).
Chat continuously with a loaded document from the command line.
"""

import os
import sys
import base64
from pathlib import Path
from mistralai import Mistral

# ---------------------------------------------------------------------------
# Config
# ---------------------------------------------------------------------------
API_KEY = os.environ.get("MISTRAL_API_KEY", "YOUR_MISTRAL_API_KEY")
OCR_MODEL = "mistral-ocr-latest"
CHAT_MODEL = "mistral-large-latest"

MIME_TYPES = {
    ".pdf": "application/pdf",
    ".png": "image/png",
    ".jpg": "image/jpeg",
    ".jpeg": "image/jpeg",
    ".tiff": "image/tiff",
    ".webp": "image/webp",
}

SYSTEM_PROMPT = (
    "You are a professional document extractor and analyst. "
    "Answer questions using only the provided document context. "
    "If the answer is not present in the context, say so explicitly "
    "rather than guessing."
)


def load_document_text(client: Mistral, file_path: str) -> str:
    """
    Load a document's text content.
    - .txt files are read directly.
    - .pdf / image files are sent through Mistral OCR and returned as Markdown.
    """
    path = Path(file_path)
    if not path.exists():
        raise FileNotFoundError(f"File not found: {file_path}")

    suffix = path.suffix.lower()

    if suffix == ".txt":
        return path.read_text(encoding="utf-8")

    if suffix not in MIME_TYPES:
        raise ValueError(
            f"Unsupported file type: {suffix}. "
            f"Supported: .txt, {', '.join(MIME_TYPES.keys())}"
        )

    # OCR path: local file -> base64 -> Mistral OCR
    file_bytes = path.read_bytes()
    encoded = base64.b64encode(file_bytes).decode("utf-8")
    mime_type = MIME_TYPES[suffix]

    # PDFs and images use different "type" keys in the document payload
    if suffix == ".pdf":
        document_payload = {
            "type": "document_url",
            "document_url": f"data:{mime_type};base64,{encoded}",
        }
    else:
        document_payload = {
            "type": "image_url",
            "image_url": f"data:{mime_type};base64,{encoded}",
        }

    print(f"[OCR] Processing {path.name} with {OCR_MODEL} ...")
    ocr_response = client.ocr.process(model=OCR_MODEL, document=document_payload)

    # Stitch all pages together into one Markdown context, with page markers
    pages_markdown = []
    for page in ocr_response.pages:
        pages_markdown.append(f"\n--- Page {page.index + 1} ---\n{page.markdown}")
    full_text = "\n".join(pages_markdown)

    print(f"[OCR] Done. Extracted {len(ocr_response.pages)} page(s), "
          f"{len(full_text)} characters.")
    return full_text


def ask_question(client: Mistral, document_context: str, question: str,
                  history: list) -> str:
    """
    Send a question to the chat model, grounded in the document context.
    `history` holds prior Q&A turns so follow-up questions have continuity.
    """
    messages = [{"role": "system", "content": SYSTEM_PROMPT}]

    # Only inject the full document once, as the first user turn, to save tokens.
    # Every subsequent turn just adds Q&A pairs so the model keeps the thread.
    if not history:
        messages.append({
            "role": "user",
            "content": f"Document Context:\n{document_context}\n\nQuestion: {question}",
        })
    else:
        messages.append({
            "role": "user",
            "content": f"Document Context:\n{document_context}\n\nQuestion: {history[0]['question']}",
        })
        messages.append({"role": "assistant", "content": history[0]["answer"]})
        for turn in history[1:]:
            messages.append({"role": "user", "content": turn["question"]})
            messages.append({"role": "assistant", "content": turn["answer"]})
        messages.append({"role": "user", "content": question})

    response = client.chat.complete(model=CHAT_MODEL, messages=messages)
    return response.choices[0].message.content


def main():
    if API_KEY == "YOUR_MISTRAL_API_KEY":
        print("ERROR: Set MISTRAL_API_KEY as an environment variable, "
              "or edit API_KEY in this script.")
        sys.exit(1)

    if len(sys.argv) > 1:
        file_path = sys.argv[1]
    else:
        file_path = input("Path to document (.txt/.pdf/.png/.jpg): ").strip().strip('"')

    client = Mistral(api_key=API_KEY)

    try:
        document_context = load_document_text(client, file_path)
    except (FileNotFoundError, ValueError) as e:
        print(f"ERROR: {e}")
        sys.exit(1)

    print("\nDocument loaded. Ask questions about it (type 'exit' or 'quit' to stop).\n")

    history = []
    while True:
        question = input("You: ").strip()
        if question.lower() in ("exit", "quit"):
            print("Goodbye.")
            break
        if not question:
            continue

        try:
            answer = ask_question(client, document_context, question, history)
        except Exception as e:
            print(f"[ERROR] {e}")
            continue

        print(f"\nAgent: {answer}\n")
        history.append({"question": question, "answer": answer})


if __name__ == "__main__":
    main()