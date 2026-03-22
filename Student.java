class Students {
    int mark;
    String Name;

    Students(String n, int m) {   
        Name = n;
        mark = m;
    }

    void result() {
        if (mark >= 90) {
            System.out.println("U passed ideot " + Name);
        } else if (mark >= 50) {
            System.out.println("Better hang on wall");
        } else {
            System.out.println("U failed my dear boy");
        }
    }
}

public class Student {
    public static void main(String args[]) {

        Students s1 = new Students("Mogana", 45); 
        Students s2 = new Students("Aalim", 90);

        s1.result();
        s2.result();
    }
}