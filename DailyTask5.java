import java.util.Scanner;
public class DailyTask5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Unit in the Electric Board: ");
        int Unit = sc.nextInt();
        int TotalAmount = 0;

        if(Unit <= 500){
            TotalAmount = Unit * 500;
        }
        else if(Unit >= 500){
            TotalAmount = Unit * 1000;
        }
        System.out.println("The Total Amount to be Paid : " +TotalAmount);
    }
}