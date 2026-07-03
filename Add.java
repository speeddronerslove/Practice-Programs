class Student {
    String name;
    int age;
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Add {
    public static void main(String[] args) {
        Student Stud1 = new Student();
        Stud1.name = "Alice";
        Stud1.age = 20;
        Stud1.display();
    }
}