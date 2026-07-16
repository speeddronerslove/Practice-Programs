public class finall{

    final int a = 10 ;
    final int b = 100 ;
 public static void main(String[] args) {
    finall fc = new finall();
    fc.a = 12; // causes error due to final declaration
    System.out.print(fc.b);
 }
}