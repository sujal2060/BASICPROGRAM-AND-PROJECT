package Simpleinterest;
import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount");
        int p = sc.nextInt();
        System.out.println("Enter time");
        int t = sc.nextInt();
        System.out.println("Enter rate");
        int r = sc.nextInt();
        int si = (p*t*r)/100;
        System.out.println("Simple Interest amount is : " + si);
    }
}
