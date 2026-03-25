import java.util.Scanner;
class Bankaccount {
    String name;
    int balance;

    Bankaccount (String n,int b){

        name=n;
        balance=b;
    }

    void deposit (int amount) {
        System.out.println ("The balance before deposit "+balance);
        balance += amount;
        System.out.println("The balance after the deposit "+balance);

    }

    void withdraw (int amount) {
        if (amount <= balance){
        System.out.println("The amount before withdraw "+balance);
        balance -= amount ;
        System.out.println("Balance after withdraw "+balance);}
        else{
            System.out.println(" Insufficient balance ");
        }

    }
    
}
public class ATM {
    public static void main (String args []){
    Scanner sc = new Scanner (System.in);
    Bankaccount Bnk = new Bankaccount("Mogana", 1000);
    while (true){
    System.out.println("Enter the choices\r\n"+  "1.Deposit\r\n" + //
                "2.Withdraw\r\n" + //
                "3.Exit");
    int choice = sc.nextInt();
    if (choice==1){
        System.out.println("Enter the amount to be Deposited");
        int amount = sc.nextInt();
        Bnk.deposit(amount);
    }
    else if (choice==2){
        System.out.println("Enter the amount to be withdrawed");
        int amount = sc.nextInt();
        Bnk.withdraw(amount);
        
    }
    else if (choice==3) {
        break ;


    }
    }
}
}