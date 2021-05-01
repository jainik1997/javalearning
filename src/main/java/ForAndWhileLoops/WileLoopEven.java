package ForAndWhileLoops;

public class WileLoopEven {
    public static void main (String [] args){
        System.out.println("Table of 10 Even Number");
        int i = 1;
        while (i <=20){
            if (i%2 != 0){
                System.out.println(" " + i);
                i++;
            }
        }
    }
}
