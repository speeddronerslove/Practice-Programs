import java.util.ArrayList;
import java.util.Iterator; // Missing import added

public class IteratorExample { // Class renamed to avoid conflict
    public static void main(String[] args) {
         
        ArrayList<String> nun = new ArrayList<>();
        nun.add("India");
        nun.add("United States of America");
        nun.add("Africa");
        nun.add("Pakistan");

        Iterator<String> ite = nun.iterator();

        System.out.println(ite.next()); // Output: India
    }
}
