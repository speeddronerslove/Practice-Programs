import java.util.Scanner;
public class ArmstrongDyna{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        
        int original = num;
        int count =0;
        int sum= 0;
        
        int temp =num;
        while(temp !=0){
            temp =temp /10;
            count++;
        }
        temp =num;
        while(temp != 0){
            int digit = temp % 10;

            int power = 1;
            for (int i=0;i < count; i++){
                power = power * digit;
            }
            sum += power;
            temp = temp/ 10;
        }
        if (sum == original){
            System.out.println("The Number is Armstrong");
        }
        else{
            System.out.println("No its not Armstrong naina, Welcome again");
        }
        sc.close();
    }
}