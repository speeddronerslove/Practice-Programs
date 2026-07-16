public class DailyTask2{
    public static void main(String[] args){
        int num[] ={12,45,67,43,9,10};
        int smallest = num[0];
        for(int i= 0; i< num.length; i++){
            if(num[i]< smallest ){
                smallest = num[i];
            }
        }
        System.out.println("the smallest number:" + smallest);
    }
}