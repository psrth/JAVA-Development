package Arrays;
import java.util.*;
import java.lang.*;

public class reverseCaps{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int length=str.length();
        String strr="";
        for(int i=0;i<(length-1);i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch))
                strr+=Character.toUpperCase(ch);
            else
                strr+=Character.toLowerCase(ch);
        }
    
        System.out.print(strr);
    }
}
    
           