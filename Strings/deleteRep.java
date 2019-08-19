package Strings;
import java.util.Scanner;
//deleteRep 1.0

public class deleteRep{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=0;
    
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        int l = s1.length();

        String s2 = "";
        //hello
        for(int i=0; i<l;i++){
            if (i==l-1){
                s2=s2 +(s1.charAt(i));
                break;
            }
            if(s1.charAt(i)==s1.charAt(i+1))continue;
            s2=s2 +(s1.charAt(i));
            num++;
        }
    
        System.out.println(s2);
    }
}

            
            
        