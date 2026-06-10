package main;
import java.util.Scanner;
public class Condition {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if( num > 0) {
            System.out.println("x is positive");
        }
        else if( num < 0){
            System.out.println( " x is negative");
        }
        else {
            System.out.println(" x is zero");
        }

    }
}
