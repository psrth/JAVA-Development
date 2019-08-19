package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2017 - Q6

import java.util.Scanner;
import java.lang.Math;
public class SwitchSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select which series you would like to implement.");
        System.out.println("1. Sum of x powers \n2. 1 Series");
        int sel=sc.nextInt();
        double S =0;
        switch(sel){
            case 1: for(int i=1;i<=20;i+=2){
                         S=S+Math.pow(2,i)-Math.pow(2,i+1);
                    }
                    System.out.println(S);
                    break;
            case 2: for(int i=1;i<=5;i++){
                        for (int j=1; j<=i;j++)System.out.print("1");
                        System.out.print("   ");
                    }
                    break;
            default: System.out.println("You have entered an incorrect choice.");
                     break;
        }
    }
}
        