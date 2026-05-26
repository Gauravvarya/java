package main;

public class Example2 {
    public static void main() {
        int x = 5;// x has local scope

        if (x == 5){ // block starts here
            int y =10;//y has block scope within if statement
            System.out.println(y);// y can be accessed here
        }//block ends here
        System.out.println(x);// x can be access here
        //System.out.println(y);// y can be accessed here
    }// x destroyed here
}