package Arrays;

import java.util.Scanner;
public class insertionSort {
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
        //insertion sort begins
        for (int i=0;i<size-1;i++){
            if (arr[i]>arr[i+1]) {
                int tmp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=tmp;
            }
        }
        for (int i=0; i<size;i++) System.out.print(arr[i]);
    }
}
            
        

        
