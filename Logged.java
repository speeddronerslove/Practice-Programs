import java.util.Scanner;

class Login {
    String username;
    String password;

    Login(String u, String p) {
        username = u;
        password = p;
    }

    void checker(String u, String p) {
        if (u.equals(username) && p.equals(password)) {
            System.out.println("Login successful "+username);
        } else {
            System.out.println("Invalid credentials");
        }
    }
}

public class Logged {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Login lg = new Login("speeddroners", "twsl21");

        System.out.print("Enter the username: ");
        String u = sc.next();

        System.out.print("Enter the password: ");
        String p = sc.next();

        lg.checker(u, p);

        sc.close();
    }
}