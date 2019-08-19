package Strings;
import java.util.Scanner;
public class blankCounter {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String s = new Scanner(System.in).nextLine();
        int blanks = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                blanks++;
            }
        }
        System.out.println("The number of spaces = " +blanks);
    }
}

