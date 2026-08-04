import java.util.Scanner;
public class KrishnaMurthyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int Original = num;
        int sum= 0;

        while (num > 0) {

            int digit= num % 10;
            int factorial= 1;
            for (int i = 1;i <= digit;i++) {
                factorial =factorial *i;
            }
            sum = sum + factorial;
            num = num / 10;
        }
        if (sum == Original) {
            System.out.println(Original + " is a Krishnamurthy Number.");
        } else {
            System.out.println(Original + " is not a Krishnamurthy Number.");
        }
        sc.close();
    }
}