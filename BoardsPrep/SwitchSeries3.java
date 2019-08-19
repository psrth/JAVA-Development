package boardsPrep;
import java.util.Scanner;

//Author: Parth Sharma, 10D
//ICSE.Board.Paper.2011 - Q9

public class SwitchSeries3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sel=0;
        
        System.out.println("1. Incr. Series \n2. Div Series");
        sel=sc.nextInt();
            
        switch (sel){
            case 1:  int m=1;
                     int a=0;
                     System.out.println("Enter no. of terms.");
                     int n=sc.nextInt();
                     for(int i=0;i<n;i++){
                        System.out.print(a+" ");
                        m+=2;
                        a+=m;
                     }
                     break;
            case 2:  int sum=0;
                     for(int i=1;i<20;i+=2){
                        sum=sum+(i/i+1);
                     }
                     System.out.println(sum);
                     break;
            default: System.out.println("Invalid entry.");
        }
    }
}
                    
                        