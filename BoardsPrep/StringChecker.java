package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2017 - Q8

import java.util.Scanner;
public class StringChecker {
    public void check(String str,char ch){
        int l = str.length();
        int digits=0;
        for (int i=0;i<l;i++){
            if(str.charAt(i)==ch)digits++;
        }
        System.out.println("Occurences of "+ch+" is="+digits);
    }
    
    public void check(String s1){
        String str=s1.toLowerCase();
        int l = s1.length();
        for (int i=0;i<l;i++){
            char ch = s1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.print(str.charAt(i)+"  ");
        }
    }    
}