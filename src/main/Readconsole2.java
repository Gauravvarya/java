package main;
import java.util.Scanner;
public class Readconsole2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        System.out.println("Enter the number:");
        System.out.println("Enter the floatNumber:");
        float number = input.nextFloat();
        double no = input.nextDouble();
        int num = input.nextInt();

        System.out.println("your entered:"+ num);
        System.out.println("your double number:" + num);
        System.out.println("your float number:" + num);

    }
}
