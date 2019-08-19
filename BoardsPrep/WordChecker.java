package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2016 - Q6

import java.util.Scanner;
public class WordChecker{
    
    public static boolean specWord(String s){
        int n=s.length();
        if(s.charAt(0)==s.charAt(n-1))return true;
        else return false;
    } 
       
    public static boolean palinWord(String str){
        int n=str.length();
        String s1="";
        for(int i=n-1;i>=0;i--){
            s1=s1+str.charAt(i);
        }
        return(s1.equals(str));
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str2=sc.nextLine();
        boolean che= specWord(str2);
        boolean che2=palinWord(str2);
        if(che==true)System.out.println("It is a special word.");
        else System.out.println("It isn't a special word.");
        if(che2==true)System.out.println("It is a Palindrome.");
        else System.out.println("It is not a palindrome.");
    }
}
