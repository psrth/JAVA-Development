// ------ BASICS OF ARRAY ------
// simple program illustrating the input of elements
// into an array and sbsq. printing them
// Version 1.01.
// author: Parth Sharma

package Arrays;
import java.util.Scanner;

public class BasicsArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit for the array: ");
        int lim = sc.nextInt();

        int arr[] = new int[lim];             //array declaration
    
        for (int i=0;i<lim;i++){              //index input for arr
            System.out.println("Enter element n. "+(i+1)+": ");
            arr[i] = sc.nextInt();              
        }           
    
        for (int i=0;i<lim;i++)
            System.out.print(arr[i]+"  ");      //printing arr[]
    }
}