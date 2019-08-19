package Strings;
import java.util.*;
public class vowelCounter {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowel = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
			ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
				vowel ++;
            }
        System.out.println("The number of times it occurs = " +vowel);
    }
}

