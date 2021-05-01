package homework;

public class Voting {
    public static void main (String[]args) {
        int Age = 21;
        if (Age < 18){
            System.out.println ("Not eligible age for vote");
        }else if (Age>18){
            System.out.println ("Eligible for vote");
        }
    }
}
