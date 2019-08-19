package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2011 - Q7

import java.util.Scanner;
public class VowelAdv{
    public static void main(){
        Scanner sc=new Scanner(System.in);
            
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int l=str.length();
    
        str=str.replace('a','b');
        str=str.replace('e','f');
        str=str.replace('i','j');
        str=str.replace('o','p');
        str=str.replace('u','v');
     
        System.out.print(str);
    }
}