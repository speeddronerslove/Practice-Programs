import java.util.Scanner;
public class Peterson{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int Original = num;
        int sum =0;

        while(num > 0){
            int digit = num % 10;
            int fact = 1;
            for(int i =1; i <= digit; i++)//i should start from 1 since fact of 0 will make everything zero
            {
                fact *= i;
                
            }
            sum += fact;
            num = num/10;

        }
        if(sum ==Original){
            System.out.println("It is Peterson Nnum goiss!");
        }
        else{
            System.out.println("It is not Peterson");
        }
    }
}