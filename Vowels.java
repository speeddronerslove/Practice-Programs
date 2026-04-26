import java.util.Scanner;
public class Vowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur String to find vowels and constants : ");
        String str = sc.next();
        str = str.toLowerCase();
        int vowels = 0;int  constants = 0 ;
        for (int i = 0 ; i < str.length();i++){
            char chr = str.charAt(i);
            if (chr >= 'a' && chr <= 'z'){
                if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u'){
                    vowels ++;
                }
                else{
                    constants++;
                }
            }
        }
        System.out.println("The Vowels in the given string are "+ vowels);
        System.out.println("The Constants are "+ constants);
        sc.close();
    }
}