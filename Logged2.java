import java.util.Scanner;
class Logged {
    String username;
    String password;

    Logged (String u,String p){
        username=u;
        password=p;
    }
    boolean login (String u,String p){
        if(u.equals(username) && p.equals(password)){
            System.out.println("Login successfull "+username);
            return true ;

        }
        else{
            System.out.println("Invalid username or password ");
            return false;
        }
    }
    
}
public class Logged2 {
    public static void main(String[] args) throws Exception {
        Logged lg = new Logged("speeddroners", "twsl21");
        Scanner sc = new Scanner(System.in);
        int attempts = 3;
        while (attempts > 0){
            System.out.println("Enter the username = ");
            String u = sc.next();
            Thread.sleep(1000);
            System.out.println("Enter the Password = ");
            String p = sc.next();
             Thread.sleep(1000);
           boolean status =  lg.login(u, p);
        if(status){
            break ;
        }
        if(attempts==0){
            System.out.println("Account Locked");
        }
        else {
            attempts--;
            System.out.println("Attempts left "+attempts);
        }


        }

    }
}