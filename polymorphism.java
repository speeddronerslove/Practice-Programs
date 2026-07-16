class Animal {

    void makesound (){
        System.out.println("I make sound ");
    }
    
}
class Dog extends Animal  {

    @Override

    void makesound (){
        System.out.println("The dog barks ");
    }


}
public class polymorphism {
    public static void main(String[] args) {
        Animal dg = new Dog();
        dg.makesound();

    }
}
