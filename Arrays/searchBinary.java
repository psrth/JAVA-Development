// ------ BINARY SEARCH ------
// Binary Search involves using a key
//   which acts as split to search
// version 1.0.1
// author: Parth Sharma

package Arrays;
import java.util.Scanner;

public class searchBinary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit for the array: ");
        int lim = sc.nextInt();

        int arr[] = new int[lim];             
    
        for (int i=0;i<lim;i++){              
            System.out.println("Enter element n. "+(i+1)+": ");
            arr[i] = sc.nextInt();              
        }           
    
        System.out.print("Enter the n. to be found: ");
        int check = sc.nextInt();   

        int first = 0;
        int last = arr[lim-1];
        int key=0;

        while(first<=last){
            key =(first+last)/2;
            if(check>key)
                first=key+1;
            else if (check==key){
                System.out.println("Element found at position "+check);
                break;
            }
            else last=key-1;
        }
        if (last<=first)
            System.out.println("Element not found.");
    }
}
            
       
        
       
       
    













