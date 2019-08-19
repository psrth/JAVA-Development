package Strings;
import java.util.Scanner;

public class Comp2Practical {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int length = str.length();
        char ch = str.charAt(length-1);
        if (ch == '.' || ch == '?')
            System.out.print("ERROR.");
        
        for (int i = 0; i<length; i++){
            if(str.charAt(i)==' '){
                str(
        }
    }
}