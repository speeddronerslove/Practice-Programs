class Animalia {
    String Name;
    String Type;
    int Age;
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
}

public class Animal {
    public static void main(String args[]) {

        Cat cat = new Cat();   
        Dog dog = new Dog();   

        cat.Cat();
        dog.Dog();
    }
}