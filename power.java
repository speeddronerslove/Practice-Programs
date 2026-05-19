import java.util.Scanner;
public class power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value of base");
        int base = sc.nextInt();
        System.out.print("Enter a value of power");
        int power = sc.nextInt();

        double result = Math.pow(base, power);

        System.out.println("The power of given  value is " +result);

        sc.close();
    }
}