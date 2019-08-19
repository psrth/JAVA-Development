package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2015 - Q4

import java.util.Scanner;

public class ArrayEleSort {

    public static void main(){

        Scanner sc=new Scanner(System.in);
        int num=3,small=0,greatest=0,sum=0,n=0;
        int arr[] = new int[num];
        
        for(int i=0;i<num;i++){

            System.out.println("Enter element "+(i+1)+": ");
            n = sc.nextInt();
            arr[i]=n;

            if (i==0) {
            small=n;
            greatest=n;
            }

            if (small>n) small=n;
            if (greatest<n) greatest=n;
            sum=sum+arr[i];
         }
    
        System.out.println("The largest number is "+greatest);
        System.out.println("The smallest number is "+small);
        System.out.println("The sum of all elements is "+sum);
        
    }
}

