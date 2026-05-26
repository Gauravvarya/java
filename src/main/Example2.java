package main;

public class Example2 {

    public static void main(String[] args){


        int x = 5; // x has local scope

        if (x == 5) { // block starts here
            int y = 10; // block scope
            System.out.println(y);
        } // block ends here

        System.out.println(x);

        // System.out.println(y); //
    }
}