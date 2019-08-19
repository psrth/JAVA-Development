package numberManipulation;

import java.util.Scanner;
import java.lang.Math;
public class armstrongN{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int input = sc.nextInt();
        int temp =input;
        int digits =0;
        while (temp!=0) {
            digits++;
            temp=temp/10;
        }
        int remainder;
        double sum =0;
        temp=input; 
        while (temp!=0) {
            remainder=temp%10;
            sum = sum + Math.pow(remainder,digits);
            temp=temp/10;
          }
        if (input==sum)System.out.println("It is an Armstrong Number.");
        else System.out.println("It is not.");
    }
}
        
        