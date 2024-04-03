package CurrencyConverter;
import java.util.Scanner;
public class currencyconverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CURRENCY CONVERTER");
        System.out.println("1. USD to NPR");
        System.out.println("2.NPR to USD");
        System.out.println("3.INR to NPR");
        System.out.println("4.NPR to INR");
        System.out.println("5. NPR to AUS");
        System.out.println("6.AUS to NPR");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Amount in US dollar");
                int usd = sc.nextInt();
                System.out.println("$" + usd + "=" + "Rs" + (usd * 113.18));
                break;
            case 2:
                System.out.println("Enter Amount in Nepali Rupees");
                int npr = sc.nextInt();
                System.out.println("Rs" + npr + "=" + "$" + (npr / 113.18));
                break;
            case 3:
                System.out.println("Enter Amount in Indian Rupees");
                int inr = sc.nextInt();
                System.out.println("INDIAN RS" + inr + "="+"NEPALI RS" + (inr/1.60));
                break;
            case 4:
                System.out.println("Enter Amount in Nepali Rupees");
                int npr1= sc.nextInt();
                System.out.println("NEPALI RS" + npr1 + "=" + "INDIAN RS"+(npr1*1.60));
                 break;
            case 5:
                System.out.println("Enter Amount in Nepali Rupees");
                int npr2=sc.nextInt();
                System.out.println("NEPALI RS" + npr2 + "=" + "AUS $"+(npr2/86.83));
                break;
            case 6:
                System.out.println("Enter Amount in Australian Dollar");
                int ausd=sc.nextInt();
                System.out.println("AUS $" + ausd + "=" + "NEPALI RS" + (ausd*86.83));
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }
    }
}
