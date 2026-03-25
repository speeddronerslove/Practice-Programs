class Bankaccount {
    String name;
    int balance;

    Bankaccount (String n,int b){
        name=n;
        balance=b;
    }
    void deposit (int amount){
        balance += amount;
        System.out.println("Balance after deposit is "+balance);
        }
    void withdraw (int amount){
        if (amount>balance){
            System.out.println("Insufficient amount");}
        else {
            balance -= amount;
            System.out.println("The amount is debited remaining is"+balance);
        }
        
    }

}

    public class Bank {
        public static void main (String args []){
            Bankaccount Bnk = new Bankaccount("Mogana",1000);
            Bnk.deposit(5000);
            Bnk.withdraw(2000);
            

            

        }
    }