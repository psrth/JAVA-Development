package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2012 - Q6

import java.util.Scanner;

public class DoubleLetter{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int length=0;
        String str="";
    
        System.out.print("Enter the string: ");
        str=sc.nextLine();

        str=str.toUpperCase();
        length=str.length();
    
        for(int i=0;i<length-1;i++){
           if(str.charAt(i)==str.charAt(i+1))
              count++;
        }
        
        System.out.println(count);
    }
}