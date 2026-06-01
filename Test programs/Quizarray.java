import java.util.Scanner;
public class Quizarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String [] Questions = {
            "1. Who is the founder of CEAT",
            "2. Why crows dont fart",
            "3. In which year did perfumes invented "
         };

         String [][] options = {
            {"A. Arnold , B.Virat , C.ElonMustard, D.Indiu"},
            {"A. Small Ass, B.Much Hair , C.Low belly pressure , D"},
            {"A. 1998 , B. 2021 , C. 1233 , D. 2023"}
         };

         char [] answers = {
            'C','C','B'
         };

         int score = 0 ;

         for (int i=0 ; i < Questions.length ; i++ ){
            System.out.println(Questions[i]);
            for (int j=0; j<options[i].length; j++){
                System.out.println(options[i][j]);
            }
         System.out.println("Enter Your Answers = ");
         char userans = sc.next().toUpperCase().charAt(0);
         if (userans == answers[i]){
            System.out.println("Correct Answer");
            score++;
         }
         else {
            System.out.println("Wrong answer");
         }

         }
         System.out.println("Quiz Over .... /n Your score = "+score);
         sc.close();
    }
}