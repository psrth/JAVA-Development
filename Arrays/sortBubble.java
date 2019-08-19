// ------ BUBBLE SEARCH ------
// Bubble Sort involves switching
//   alternating indices
// version 1.0.1
// author: Parth Sharma
// bubble sort explanation
// https://www.youtube.com/watch?v=yIQuKSwPlro

package Arrays;
import java.util.Scanner;

public class sortBubble{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit for the array: ");
        int lim = sc.nextInt();

        int arr[] = new int[lim];             
    
        for (int i=0;i<lim;i++){              
            System.out.println("Enter element n. "+(i+1)+": ");
            arr[i] = sc.nextInt();              
        }           
    
        for (int i=0;i<lim-1;i++){
            for (int j=0;j<lim-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        for (int i=0;i<lim;i++){              
            System.out.println(arr[i]+" ");           
        }  
    }
}
            
