package P_2019;
import java.util.Scanner;
import java.util.Arrays;

public class Arraynging {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the range of the array: ");
        int range = sc.nextInt();
        
        int arr[] = new int[range];
        
        for (int i=0; i<range; i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        
    }
}