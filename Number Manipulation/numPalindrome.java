package numberManipulation;

import java.util.Scanner;
public class numPalindrome {
      public static boolean reverseNum(int num){
        int n, x,a=0;
        n= num;
        while (num>0){
            x=n%10;
            a=a*10+x;
            n=n/10;
        }
        if (n==num)return true;
        else return false;
        }
      public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number to be tested: ");
        int m=sc.nextInt(); 
        boolean choice;
        choice = reverseNum(m);
        if (choice==true)System.out.println("It is a palindrome.");
        else System.out.println("It is not a plaindrome");
        }
    }

        