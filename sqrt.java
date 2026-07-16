import java.util.Scanner;
public class sqrt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value");
        int num = sc.nextInt();

        double result = Math.sqrt(num);

        System.out.println("The square root of given  value is " +result);

        sc.close();
    }
}