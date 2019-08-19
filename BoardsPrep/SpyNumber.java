package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2017 - Q5

import java.util.Scanner;
public class SpyNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0,prod=1,check,rem,rem2;

        System.out.println("Enter the number to be checked:");
        int num = sc.nextInt();

        check=num;
        int check2=num;
        while(check>0) {
            rem=check%10;
            sum=sum+rem;
            check=check/10;
        }
        
        while(check2>0){
            rem2=check2%10;
            prod=prod*rem2;
            check2=check2/10;
        }
        
        if (sum==prod)
            System.out.println(num+" is a spy number.");
        else 
            System.out.println(num+" is not a spy number.");
    }
}

            
             
            
   

           