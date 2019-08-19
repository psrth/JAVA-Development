package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2015 - Q9

import java.util.Scanner;
   
public class SwitchMenu{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("SWITCH SERIES 2015");
        System.out.println("1. Factor Display \n2. Factorial Calc");
        int sel=sc.nextInt();

        switch (sel){
           case 1: System.out.println("Enter the number to be factorised");
                   int num=sc.nextInt();
                   for (int i=1;i<num;i++){
                      if(num%i==0)System.out.print(i+" ");  
                   }
                   break;
           case 2: System.out.println("Enter the number");
                   int n=sc.nextInt();
                   int factorial=1;
                   for(int i=1;i<=n;i++)factorial*=i;
                   System.out.println(factorial);
                   break;
           default: System.out.print("Nice.");
                     break;
        }
    }
}
                   
                    
        
        