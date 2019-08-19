// ------ LINEAR SEARCH ------
// Linear Search involves cross-checking
//   the test number with each index
// version 1.0.1
// author: Parth Sharma

package Arrays;
import java.util.Scanner;

public class searchLinear{
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

            
               
        for (int i=0;i<lim;i++){
            if (arr[i]==check){
                System.out.println("Element found at index "+(i+1));
                break;
            }
            else if (i==(lim-1))
                System.out.println("Element does not exist.");
        }
    
    }
}
            