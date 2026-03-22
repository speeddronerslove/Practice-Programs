class Animalia {
    String Name;
    String Type;
    int Age;
    void show () {
    }
}

class Dog extends Animalia {
    Dog() {
        Name = "Molli";
        Type = "Calio Dog";
        Age = 2;
    }

    void Dog() {
        System.out.println("My name is " + Name + " I am a Dog " + Type + " with age " + Age);
    }
     void show () {
        System.out.println("This is overrided one of dog");
     }
}

class Cat extends Animalia {
    Cat() {
        Name = "dolli";
        Type = "Calio cat";
        Age = 2;
    }

    void Cat() {
        System.out.println("My name is " + Name + " I am a Cat " + Type + " with age " + Age);
    }
     void show () {
        System.out.println("This is overrided one of cat");
     }
}

public class Animal {
    public static void main(String args[]) {

        Cat cat = new Cat();   
        Dog dog = new Dog(); 
        Animalia a1 = new Cat();
        Animalia a2 = new Dog();  

        cat.Cat();
        dog.Dog();
        a1.show();
        a2.show();
    }
}