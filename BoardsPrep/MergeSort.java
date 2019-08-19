package P_2019;
// Program to Merge Sort
// CompSki with Rashmita ma'am S1

import java.util.Scanner;
public class MergeSort { 
    void merge(int arr[], int l, int m, int r) { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m;
        
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 


        // Merge the temp arrays

        int i = 0, j = 0; 
        int k = l; 
        
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                arr[k] = L[i]; 
                i++; 
            } 
            else { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 

        // Copying remainining elements of L[]
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 

        // Copying remainining elements of R[]
        while (j < n2){ 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 

    void sort(int arr[], int l, int r) { 
        if (l < r) { 
            int m = (l+r)/2; 
            
            sort(arr, l, m); 
            sort(arr , m+1, r); 
            
            merge(arr, l, m, r); 
        } 
    } 

    // Function to print array
    static void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

    // Main Method
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 

        System.out.println("Given Array"); 
        printArray(arr); 

        MergeSort parth = new MergeSort(); 
        parth.sort(arr, 0, arr.length-1); 

        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 

