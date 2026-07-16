class Animal {
    void Animal () {
        System.out.print("Animal sounds like");
    }
}
class cat extends Animal {
    void cat () {
        super.Animal();
        System.out.println("Jomeowww meowwwoweow ");
    }
}
public class superkeyword {
    public static void main(String[] args) {
        Animal an = new Animal();
        cat ct = new cat();

        an.Animal();
        ct.cat();
    }
}