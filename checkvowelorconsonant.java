package checkvowelorconsonant;
import java.util.Scanner;

public class checkvowelorconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char a = sc.next().charAt(0); // Corrected method call

        if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.println("Character you entered is a vowel");
        } else {
            System.out.println("Character you entered is a consonant");
        }
    }
}
