<<<<<<< HEAD
import java.util.Scanner;
public class MathEg1{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Number: ");
    int num =sc.nextInt();

    int sum = 0;

    while(num > 0){
        int digit = num % 10; 
        sum += digit;         
        num = num / 10;
    }
    System.out.println(sum);
}
=======
import java.util.Scanner;
public class MathEg1{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Number: ");
    int num =sc.nextInt();

    int sum = 0;

    while(num > 0){
        int digit = num % 10; 
        sum += digit;         
        num = num / 10;
    }
    System.out.println(sum);
}
>>>>>>> 0595234e317be3b63092a671f01dfe3691a164f0
}