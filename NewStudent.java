import java.util.Scanner;
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
public class NewStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of students");
        int n = sc.nextInt();
                Student[] students = new Student[n];

        students[0] = new Student("Mogana", 78);
        students[1] = new Student("David", 98);
        students[2] = new Student("Arun", 45);

        System.out.println("All Grades:");
        for (int i = 0; i < students.length; i++) {
            students[i].grade();
        }

        System.out.println("\nToppers:");
        for (int i = 0; i < students.length; i++) {
            students[i].istopper();
        }
        sc.close();
    }
}