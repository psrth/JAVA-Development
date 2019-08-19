package Arrays;

import java.util.Scanner;
public class selectionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a limit for the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i=0; i<size;i++) {
            System.out.print("enter variable "+(i+1)+" :");
            int init = sc.nextInt();
            arr[i] = init;
            }
        //selection sort begins
        for (int i=0; i<size-1;i++) {
            int pos=i;
            for (int j=i+1; j<size; j++)if (arr[j] < arr[pos])pos=j;
            int tmp = arr[pos];
            arr[pos]=arr[i];
            arr[i]=tmp;
            }
        //display array in sorted form
        for (int i=0; i<size; i++)System.out.print(arr[i]+" ");
     }   
}