import java.util.Scanner;
public class WordReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence ");
        String str = sc.nextLine();

        String[] word = str.split(" ");

        for(int i = word.length -1; i>= 0; i--){
            System.out.println(word[i] +" ");
        }
        sc.close();
    }
}