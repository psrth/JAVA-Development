package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2014 - Q8

import java.util.Scanner;
import java.lang.Math;

public class BankDeposit {
    public static double termDeposit(double p, double r,int n){
        double ma=0,de=0;
        r/=100;
        de=1+(r/100);
        ma=p*Math.pow(de,n);
        return ma;
    }
    
    public static double recurDeposit(double P, double r, int n){
        double ma=0, interest=0;
        r/=100;
        interest=(P*n*(n+1)*r)/24;
        ma=(P*n)+interest;
        return ma;
    }

    public static void main(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("FAST BANKING SOLUTIONS");
        System.out.println("1. Term Deposit \n2. Recuuring Deposit");
        int sel=sc.nextInt();
        sc.nextLine();
        
        switch (sel){
            case 1: System.out.println("Enter your following details: ");
                    System.out.println("1. Principal \n2. Rate of Interest \n3.Time Period(y)");
                    double pr=sc.nextDouble();
                    double r8=sc.nextDouble();
                    int years=sc.nextInt();
                    System.out.println(termDeposit(pr,r8,years));
                    break;
            case 2: System.out.println("Enter your following details: ");
                    System.out.println("1. Monthly Inst. \n2. Rate \n3.Time Period(m)");
                    double pr2=sc.nextDouble();
                    double r82=sc.nextDouble();
                    int years2=sc.nextInt();
                    System.out.println(recurDeposit(pr2,r82,years2));
                    break;
            default: System.out.println("Invalid selection.");
        }
    }
}
        
    
        
        
        
        