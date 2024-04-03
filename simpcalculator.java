package CALCULATOR;
import java.util.Scanner;
public class simpcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("!!!!!SIMPLE CALCULATOR!!!!!");
        System.out.println("Enter your choice");
        System.out.println("1. ADDITION");
        System.out.println("2.SUBTRACTION");
        System.out.println("3.MULTIPLICATION");
        System.out.println("4.DIVISON");
        System.out.println("5.REMAINDER");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                System.out.println("Addition Result = " + (a + b));
                break;

            case 2:

                System.out.println("Enter first number");
                int c = sc.nextInt();
                System.out.println("Enter second number");
                int d = sc.nextInt();
                System.out.println("Subtraction Result = " +( c - d));
                break;

            case 3:

                System.out.println("Enter first number");
                int e = sc.nextInt();
                System.out.println("Enter second number");
                int f = sc.nextInt();
                System.out.println("Multiplication Result = " + (e * f));

            case 4:

                System.out.println("Enter first number");
                int g = sc.nextInt();
                System.out.println("Enter second number");
                int h = sc.nextInt();
                System.out.println("Division Result = " + (g / h));
                break;

            case 5:

                System.out.println("Enter first number");
                int i = sc.nextInt();
                System.out.println("Enter second number");
                int j = sc.nextInt();
                System.out.println("Remainder Result = " + (i % j));
                break;

            default:
                System.out.println("Invalid CHoice");
                break;
        }

    }
}
