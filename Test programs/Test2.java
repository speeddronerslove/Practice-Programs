class Employee{
    String name;
    int salary;

    Employee(String n, int s){
        name=n;
        salary=s;
    }
    void tax(){
        if(salary>50000){
            System.out.println("High Tax");

        }
        else {
            System.out.println("Low tax");
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        Employee em = new Employee("Murali", 6000);

        em.tax();
    }

    
}