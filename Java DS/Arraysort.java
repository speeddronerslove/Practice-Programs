import java.util.ArrayList;
import java.util.Collections;
public class Arraysort {
    public static void main(String[] args) {
        ArrayList <String> as = new ArrayList<>();

        as.add("apple");
        as.add("canteen");
        as.add("banana");
        as.add("mango");
        as.add("grapes");
        Collections.sort(as);

        for ( String i : as ){
            System.out.println(i);

        }
        
    }
}
