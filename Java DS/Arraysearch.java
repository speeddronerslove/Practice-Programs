import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraysearch {
    public static void main(String[] args) {
        ArrayList <String> name  =  new ArrayList<>();
        Scanner sc =  new Scanner(System.in);
        name.add("Joyous");
        name.add("JCB");
        name.add("eveready");
        name.add("corona"); 
        name.add("christmas");

        Collections.sort(name);
        System.out.print(name);
        System.out.println("Enter any name to find its index number");
        String find = sc.nextLine();
        System.out.println("The element found at the index of "+Collections.binarySearch(name, "corona"));
        sc.close();
    }
    
    
}
