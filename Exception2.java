public class Exception2 {
    public static void main(String[] args) {
        try {
            int [] numbers = {1,2,3};
            System.out.println("THE number 10 is "+ numbers[10]
            );
            int divide = 10/0;
        }
        catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("The value is out of array limits");
        }
        catch (ArithmeticException e ) {
            System.out.println("The value is invalid");

        }
        catch (Exception e) {
            System.out.println("Some Unknown error occured oops !!");

        }
    }
}