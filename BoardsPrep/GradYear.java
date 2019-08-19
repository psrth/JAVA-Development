package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2014 - Q9

import java.util.Scanner;

public class GradYear {
    public static void main(){
        Scanner sc=new Scanner (System.in);        
        int arr[]={1982,1987,1993,1996,1999,2003,2006,2007,2009,2010};  
        
        System.out.println("Enter the year to be checked: ");
        int yr=sc.nextInt();
        
        for(int i=0;i<10;i++){
            if (arr[i]==yr){
                System.out.println("Record exists.");
                break;
            }
            else if (i==9)
                System.out.println("Record does not exist.");
        }
    }
}


            
            
