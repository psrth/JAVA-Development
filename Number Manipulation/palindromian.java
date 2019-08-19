package numberManipulation;

import java.util.Scanner;
public class palindromian {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number tb checked: ");
        int n = sc.nextInt();
        int tmp = n;
        int sum=0;
        int r;
        while (tmp>0) {
            r=tmp%10;
            sum = (sum*10)+r;
            tmp=tmp/10;
        }
        if (sum==n)System.out.println("It is a palindrome."); 
        else System.out.println("It is not a palindrome.");  
    }
}       
           