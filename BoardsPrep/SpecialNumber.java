package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2014 - Q5

import java.util.Scanner;

public class SpecialNumber {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int num=0,sum=0,prod=1,a=0,r=0,check=0;

        System.out.println("Enter the number to be checked.");
        num=sc.nextInt();
        a=num;
        
        while (a>0){
            r=a%10;
            sum+=r;
            prod*=r;
            a/=10;
        }
    
        check=sum+prod;

        if(check==num)
            System.out.println("Special 2-digit number");
        else 
            System.out.println("Not a special 2-digit number.");

    }
}
    
        
            
        
        
        