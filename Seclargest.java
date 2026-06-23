import java.util.Arrays;

public class Seclargest {
    public static void main(String[] args) {
        int [] arr = {10,33,21,6,19};
        int largest = arr[0];
        int secondlargest = -1 ;
        for(int i=1; i < arr.length;i++){ 
            if(arr[i] > largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        System.out.println("The Give array is "+ Arrays.toString(arr));
        System.out.println("The second largest digit is "+secondlargest);
        
    }
}
