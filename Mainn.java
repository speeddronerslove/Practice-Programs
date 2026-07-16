public 
abstract class Mainn {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); 
}

class Student extends Mainn {
  public int graduationYear = 2018;
  public void study() { 
    System.out.println("Studying all day long");
  }
}
 
