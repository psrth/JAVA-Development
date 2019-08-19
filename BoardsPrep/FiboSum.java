package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2012 - Q8

import java.util.Scanner;

public class FiboSum{
    public void fibo(){
        int m=0, n=1;
        System.out.print(m+" "+n+" ");
        for(int i=2;i<=10;i++){
            int tmp=m+n;
            System.out.print(tmp+" ");
            m=n;
            n=tmp;
        }            
    }
        
    public void sum(int n){
        int a=n, r=0,sum=0;
        while(a>0){
            r=a%10;
            sum+=r;
            a=a/10;
        }
        System.out.println(sum);
    }

    public static void main(){
        Scanner sc=new Scanner(System.in);
        FiboSum f1=new FiboSum();
    
        System.out.println("1. Fibonacci Series \n2. Sum of Digits");
        int sel=sc.nextInt();
        sc.nextLine();
    
        switch(sel){
            case 1: f1.fibo();
                    break;
            case 2: System.out.print("Enter the number: ");
                    int a=sc.nextInt();
                    f1.sum(a);
                    break;
            default: System.out.println("Invalid Choice.");
                     break;
        }
    }
}






        