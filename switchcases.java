import java.util.Scanner;
public class switchcases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello this is Joyous cooking service select the option below to order");
        System.out.println("Enter the digits for food \n1.Donut \n2.Cookie \n3.Milkshake \n4.Jomaa's special Pineapple Jam");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Hello here are ur Donuts eat eat");
                break;
            case 2:
                System.out.println("Take home these crunchy cookies ");
                break;
            case 3:
                System.out.println("Wait a minute it takes time to shake");
                break;
            case 4:
                System.out.println("Sorry Jomaa's jam is at very demand..... its out of stock");
                break;    
        }
    }
}