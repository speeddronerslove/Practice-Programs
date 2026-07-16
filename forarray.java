import java.util.Scanner;
class Student {
    String name;
    int mark;
    Student(String n, int m){
    name = n;
    mark = m;
}
}
public class forarray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of students = ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer
        Student [] s = new Student[n];
        for(int i=0 ; i<n ; i++){
            System.out.println("Enter the student name = ");
            String name = sc.nextLine();
            System.out.println("Enter the mark of student = ");
            int mark = sc.nextInt();
            s[i] = new Student(name,mark);
            
            

        }
        sc.close();
        
    }

}