package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2016 - Q8

import java.util.Scanner;
public class NivenNumber {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers to be checked: ");
        int num=sc.nextInt();
        int a =num;
        int sum=0;
        while(a>0){
            int r=a%10;
            sum+=r;
            a=a/10;
        }
        
        if(num%sum==0)System.out.println("It is a Niven Number.");
        else System.out.println("It is not a Niven Number.");

    }
}
            
