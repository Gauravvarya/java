package main;

public class Example3 {
    public static int x = 5;// x has global cope.

    static void main() {
        System.out.println(x);//x can be accessed here.

    }

    static void someMethod() {
        System.out.println(x);// x can also be accessed here.

    }


    }

