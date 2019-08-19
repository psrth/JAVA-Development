package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2016 - Q5

import java.util.Scanner;
public class SwitchSeries2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("SWITCH PROGRAM 2");
        System.out.println("1. Floyd's Triangle \n2. ICSE");
        int sel=sc.nextInt();
        int num=1;
        switch (sel){
            case 1: //floyd's triangle
                    for (int i=0;i<=5;i++){
                        for (int j=0;j<i;j++){
                            System.out.print(num+"  ");
                            num++;
                        }
                        System.out.println();
                    }
                    break;
            case 2: //ICSE
                    String str1="ICSE";
                    int n=str1.length();
                    for(int i=0;i<n;i++){
                        for(int j=0;j<=i;j++){
                           System.out.print(str1.charAt(j)+" ");
                        }
                        System.out.println();
                    }
                    break;
            default: System.out.println("Choice not found.");
                     break;
        }
    }
}
