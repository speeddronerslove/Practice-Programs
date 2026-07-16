import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a numbe to check whether it is an armstrong or not = ");
        int num = sc.nextInt();
        int original = num ;
        int sum = 0;
        while(num!=0){
            int digit = num % 10 ; // removes the last digit
            sum = sum + (digit*digit*digit);
            num = num/10;
        }
        if(original==sum){
            System.out.println("The given number is armstrong");
        }
        else{
            System.out.println("Its not an armstrong");
        }
        sc.close();
    }
    
}
