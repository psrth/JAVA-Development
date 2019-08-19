package Arrays;

//create an array to store ‘n’ numbers and display them
import java.util.Scanner;
public class arrayBasics {
   public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter width of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            System.out.print("Enter integer number " +(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for (int i=0;i<n;i++) System.out.print(arr[i]+ " ");
    }     
}