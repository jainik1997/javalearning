package homework;

public class PublicClassArithmetic {
    public static void main (String [] args){
        int a = 12;
        int b = 5;
        int result1;
        int result2;
        //addition operator
        System.out.println(a+b);

        //subtracttion oprerator
        System.out.println (a-b);

        //multiplication oprerator
        System.out.println (a*b);

        //division operator
        System.out.println (a/b);

        //modul operator
        System.out.println (a%b);

        //increment operator
        result1 = ++a;
        System.out.println ("After Increment:"+a);

        //decrement operator
        result2 = --b;
        System.out.println ("After decrement:"+b);
    }
}
