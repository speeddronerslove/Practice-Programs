import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a palindrome or not = ");
        int num = sc.nextInt();
        int original = num ;
        int reverse = 0;
        while(num!=0){
            int digit = num % 10 ; 
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        if(original==reverse){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }
        sc.close();
        
    }
    
}
