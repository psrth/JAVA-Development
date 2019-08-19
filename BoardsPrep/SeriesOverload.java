package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2013 - Q8

import java.util.Scanner;

public class SeriesOverload {
    public static double series(double n){
        double sum=0;
        for (int i=0;i<n;i++){
            sum=sum+(1/n);
        }
        return sum;
    }
    
    public static double series(double a, double n){
        int o=1;
        int m=2;
        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+(o/(Math.pow(a,m)));
            o+=3;
            m+=3;
        }
        return sum;
    }
    
    public static void main(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("SERIES OVERLOAD");
        System.out.println("1. Sum of 1/n \n2.Sum of 1/a^ series ");
        int sel=sc.nextInt();
        
        switch(sel) {
        case 1: System.out.println("Enter the double");
                double m=sc.nextDouble();
                double c=series(m);
                System.out.println(c);
                break;
        case 2: System.out.println("Enter the two doubles.");
                double a=sc.nextDouble();
                double b=sc.nextDouble();
                double x=series(a,b);
                System.out.println(x);
                break;
        default: System.out.println("Invalid Choice");
                 break;
       }
    }
}
    