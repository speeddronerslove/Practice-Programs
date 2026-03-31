 class Calci {

    int add (int a,int b){
        return a+b;
    }
    int add (int a,int b,int c){
        return a+b+c;
    }
    double add (double a,double b){
        return a+b;
    }
    
}
public class Calculator {
    public static void main (String args []){
        Calci cc =  new Calci(); 
       System.out.println(cc.add(10, 11);) 
        cc.add(11, 22);
        cc.add(2, 3, 4);
        cc.add(20, 30);

    }
}