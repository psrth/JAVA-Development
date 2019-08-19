package Arrays;

import java.util.Scanner;
public class arraySearch {
    public static int linearSearch (int arr[],int n, int key){
        for (int i=0; i<n; i++) {
            if (arr[i] == key)return (i+1);
        }
        return -1;
    }
    
    public static int binarySearch(int arr[], int first, int last, int key){
        if (last>=first) {
        int mid = first+ (last-first)/2;
        if (arr[mid]==key)return (mid+1);
        else if (arr[mid]>key)return (binarySearch(arr, first, mid-1, key)+1);
        else if (arr[mid]<key)return (binarySearch(arr, mid+1, last, key)+1);
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the array limit: ");
        int x = sc.nextInt();
        int num[]=new int[x];
        for (int i=0;i<x;i++){
            System.out.print("Enter element n."+(i+1)+": ");
            int tmp=sc.nextInt();
            System.out.println();
            num[i]=tmp;
         }
        System.out.print("Enter a key: ");
        int key =  sc.nextInt();
        System.out.println();
        System.out.println("1. Linear Search \n. Binary Search");
        int selection = sc.nextInt();
        switch (selection) {
            case 1: //linear search
                    int retribute = linearSearch(num, x, key);
                    if (retribute==-1)System.out.println("Element not found.");
                    else System.out.println("Element found at position "+retribute);
                    break;

            case 2: //binary search
                    for(int i=0;i<x;i++){
                       for(int j=0;j<x-1-i;j++){
                         if(num[j]>num[j+1]){
                               int tmp=num[j];
                               num[j]=num[j+1];
                               num[j+1]=tmp;
                         }
                        }
                    }    
                    int first = num[0];
                    int last = num[x-1];
                    int retribution = binarySearch(num, first,last,key);
                    if (retribution==-1)System.out.println("Element not found.");
                    else System.out.println("Element found at position "+retribution);
                    break;

            default: //default switch case statement
                     System.out.print("Invalid Choice.");
                     break;
        }
    }
}
