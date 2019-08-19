package Strings;
import java.util.Scanner;
//i.n.i.t.i.a.l.s

public class Initials{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String: ");
        String s =sc.nextLine();
        int k = s.length()-1;
        System.out.print(s.charAt(0)+".");
        
        int i=0;
        while(i<=k){
            String str=s.substring(i,k);
            int num = str.indexOf(" ")+1;
            System.out.print(str.charAt(num)+".");
            i=num;
        }
    }

}

            