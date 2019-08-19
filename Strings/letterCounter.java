package Strings;
import java.util.*;
public class letterCounter {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter the character to be compared: ");
        String l = sc.nextLine(); 
        char c = l.charAt(0);
        int blanks = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == c) 
                blanks++;
            }
        System.out.println("The number of times it occurs = " +blanks);
    }
}

