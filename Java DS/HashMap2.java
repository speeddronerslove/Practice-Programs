import java.util.HashMap;
public class HashMap2{
    public static void main(String[] args) {
        HashMap <String,String> hc = new HashMap<String,String>();
        
        hc.put("Murali Loves", "Himself");
        hc.put("Dolli loves", "Her babies");
        hc.put("Dolli kills", "Lizards");
        hc.put("Dolli Hates", "Sprays");

        System.out.println("The Murali and dolli "+hc);
    }
}