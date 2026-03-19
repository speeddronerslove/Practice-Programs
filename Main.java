class Computer {
    String Name;
    int Ram;
    int SSD;
    String Processor;
}
class Victus extends Computer {

    Victus () {

    Name = "Victus";
    Ram = 8;
    SSD = 512;
    Processor = "i5";}

    void vic (){
        System.out.println("The system is " + Name + "Has a ram of " + Ram + "and a SSD of " + SSD + "with a " + Processor +" Processor");

    }
}
class Acer extends Computer {
 
    Acer () {

     Name = "acer";
    Ram = 8;
    SSD = 512;
    Processor = "AMD"; }

     void ace (){
        System.out.println("The system is " + Name + "Has a ram of " + Ram + "and a SSD of " + SSD + "with a " + Processor +" Processor");

    }
}
public class Main {
public static void main (String args []){
    Victus spec = new Victus();
    Acer specs = new Acer();

    spec.vic();
    specs.ace();
}

}
