class Car {
    String name;
    int price;
  Car (String n ,int p){
    name=n;
    price=p;
  }

    void showdetails(){
        System.out.println("The name of the car is "+name);
        System.out.println("The price is about "+price);
    }
}
public class Test1{
    public static void main(String[] args) {
        Car cr1 = new Car("Toyota", 10000);
        Car cr2 = new Car("Hundai", 900000);
        cr1.showdetails();
        cr2.showdetails();
      
    }
}