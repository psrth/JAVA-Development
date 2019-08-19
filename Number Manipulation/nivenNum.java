package numberManipulation;

import java.util.Scanner;
public class nivenNum{
    public static boolean niven(int num){
        int m, a=0,x;
        m=num;
        while(m>0){
            x=m%10;
            a=a+x;
            m=m/10; 
        }
        if (num/a==0)return true;
        else return false;
        }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A NUMBER");
        int numero=sc.nextInt();
        System.out.println(niven(numero));
    }
    }