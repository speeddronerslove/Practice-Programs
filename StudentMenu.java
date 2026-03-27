import java.util.Scanner;
import java.util.concurrent.ExecutionException;
class Student {
    String name;
    int mark;
    
    Student (String n , int m){
        name=n;
        mark=m;
    }
    void grade (){
        if(mark >= 90){
            System.out.println(name+" Grade A");
        }
        else if (mark >= 75){
            System.out.println(name+" Grade B");
        }
        else if (mark >= 50){
            System.out.println(name+" Pass");
        }
        else {
            System.out.println(name+ " Failed");
        }
    }
    void istopper(){
        if(mark >= 90){
            System.out.println(name + " is a topper");
        }
        else{
            System.out.println(name + " Not an Topper");
        }
    }
    
}
public class StudentMenu {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Student s = new Student("Mogana", 78);
        while(true){
            System.out.println("Enter any of the choice\r\n" + //
                                "1. Show Grade\r\n" + //
                                "2. Check Topper\r\n" + //
                                "3. Exit");
                int choice = sc.nextInt();
                Thread.sleep(1000);
                if(choice == 1){
                    s.grade();
                }
                else if(choice==2){
                    s.istopper();
                }
                else{
                    break;
                }
        }

    }
}