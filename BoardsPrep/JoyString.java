package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2015 - Q6

import java.util.*;

public class JoyString {

    public void Joystring(String s, char ch1, char ch2){
        int l = s.length();
        String str=s.replace(ch1,ch2);
        System.out.println(str);
    }

    public void Joystring(String s){
        System.out.println("First Index : "+s.indexOf(' '));
        System.out.println("Last Index : "+s.lastIndexOf(' '));
    }
    
    public void Joystring(String s1, String s2){
        String str;
        str=s1.concat(" ");
        str=str.concat(s2);
        System.out.println(str);
    }

    public static void main(){
        Scanner sc=new Scanner(System.in);
        JoyString s1=new JoyString();
        
        System.out.println("STRING MANIPULATOR");
        System.out.println("1.Character Replacement \n2.Space Index \n3.Concat");
        int sel=sc.nextInt();
        sc.nextLine();

        switch(sel){
            case 1: System.out.println("Enter the string.");
                    String str=sc.nextLine();
                    System.out.println("Enter char to be found.");
                    char a=sc.next().charAt(0);
                    System.out.println("Enter replacement character.");
                    char b=sc.next().charAt(0);     
                    s1.Joystring(str,a,b);
                    break;
            case 2: System.out.println("Enter the string.");
                    String s=sc.nextLine();                    
                    s1.Joystring(s);
                    break;
            case 3: System.out.println("Enter first string");
                    String str1=sc.nextLine();
                    System.out.println("Enter second string");
                    String str2=sc.nextLine();
                    s1.Joystring(str1,str2);
                    break;
        }
    }
}

                    
    
