package reverseword;
import java.util.Scanner;
public class reverseword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = sc.nextLine();
        System.out.println();
        String reversedStr="";
        for (int i = 0; i < str.length(); i++) {
            reversedStr = str.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);

    }
}
