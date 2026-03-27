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
    void istopper(String name,int mark){
        if(mark >= 90){
            System.out.println(name + " is a topper");
        }
        else{
            System.out.println(name + " Not an Topper");
        }
    }
    
}
public class StudentReport {
    public static void main(String[] args) {
        Student sc = new Student("Mogana murali D", 78);
        Student sc1 = new Student("David Raju", 98);
        sc.grade();
        sc.istopper("Mogana murali D", 78);
        sc1.grade();
        sc.istopper("David Raju", 98);
        
    }
}
