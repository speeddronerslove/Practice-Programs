public class DailyTask1{
    public static void main(String[] args){
        int num[] = {2,-4,6,-8,0,12,-13};
        int positive = 0;
        int negative = 0;
         for(int i=0; i< num.length; i++){
            if(num[i]>= 0){
                positive++;
            }
            else{
                negative++;
            }
         }
         System.out.println("Number of Positives = "+positive);
         System.out.println("Number of Negatives = "+negative);
    }
}