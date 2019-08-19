package boardsPrep;
import java.util.Scanner;

//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2010 - Q4

public class BinarySearch {
    public static void main(){
        Scanner sc=new Scanner(System.in);

        int arr[]={5,7,9,11,15,20,30,45,89,97};
        int l=arr.length;
        
        System.out.print("Enter the element to be found: ");
        int n=sc.nextInt();

        for(int i=0;i<l;i++){
            if(arr[i]==n){
                System.out.println("Element found at position "+(i+1));
                break;
            }
            else if(i==(l-1))
                System.out.println("Search element not found.");
        }
    }
}

        
        