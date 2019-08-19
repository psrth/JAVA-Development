package Strings;

import java.util.Scanner;
public class palindromeCheck{
    public static boolean isPalindrome(String str){  
        StringBuilder sb=new StringBuilder(str);  
        sb.reverse();  
        String rev=sb.toString();  
        if(str.equals(rev)){  
        return true;  
        }else{  
        return false;  
        }  
     }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        boolean check = isPalindrome(s);
        if (check==true)System.out.println("It is a palindrome");
        else System.out.println("It is not a palindrome.");
    }
}
 
    
