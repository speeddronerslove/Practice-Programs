import java.util.TreeMap;
public class tree {
    public static void main(String[] args) {
        TreeMap <String,Integer> hm = new TreeMap<>();
        hm.put("Motogp", 1);
        hm.put("Gran tusimo", 2);
        hm.put("gta5", 3);
        System.out.print(hm);
        if (hm.containsKey("Motogp")){
            System.out.print("Yeah it has bro");
        }
        else {
            System.out.print("No not there");
        }
    }
}