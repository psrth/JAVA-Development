package Strings;

import java.util.Scanner;
public class reverseStr{
    public static String reverStr(String a){
        int num = a.length();
        String result = "";
        for (int i =num-1;i>=0;i--){
            result=result + a.charAt(i);
        }
        return result;
        }

    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string.");
        String str=sc.nextLine();
        System.out.println(reverStr(str));
    }
}