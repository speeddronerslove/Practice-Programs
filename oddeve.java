import java.util.Scanner;
public class oddeve {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter any digit : ");
        int num = sc.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("The entered number is even ");
        }
        else {
            System.out.println("Its an odd number bro");
        }
    }
    
    
}
