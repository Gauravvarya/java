package main;

public class consoleExample3 {
    static void main(String[] args) {
        int age = 42;
        char myChar = 'a';
        String name = "Gaurav";
        double price = 12.34567;
        boolean isTrue = true;
        System.out.println(myChar);
        System.out.println(isTrue);
        //System.out.println(myNum);
        System.out.print("hello ");
        System.out.println("world");
        // Format string
        System.out.printf("My name is %s and %d years old\n", name, age);
        System.out.printf("this price is $%.2f\n",price);
        System.out.printf("|%10d", 5);
    }
}
