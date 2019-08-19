package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2013 - Q6

import java.util.Scanner;
public class PigLatin {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        String s="",p="",s1="";
        
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        int l=str.length();
        str=str.toUpperCase();
    
        for(int i=0;i<l;i++){
           char ch=str.charAt(i);
           if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
             s=str.substring(i,l);
             p=str.substring(0,i);
             s1=s.concat(p);
             s1=s1.concat("AY");
             break;
           }
           if(i==(l-1))s1=str.concat("AY");
        }
        System.out.println(s1);
    }
}
