import java.util.Scanner;
public class Perfectnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number to check whether it is an Perfect or not : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i <= num/2;i++){
            if(num % i==0){
                sum+=i;

            }
        }
        if (sum==num){
            System.out.println("Yah its an Perfect Number");
        }
        else{
            System.out.println("No its not a perfect one");
        }
   sc.close(); }
}