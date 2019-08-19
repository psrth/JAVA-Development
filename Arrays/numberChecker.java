package Arrays;
//input ten integers and a number M from user. Display frequency of number M in stored numbers
import java.util.Scanner;
public class numberChecker {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int[10];
        System.out.print("Ënter the number to be checked: " );
        int m = sc.nextInt();
        int neg = 0;
        for (int i=0;i<10;i++) {
            System.out.print("Enter integer " +(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<10;i++) System.out.print(arr[i]+ ", ");
        for (int i =0; i<10;i++)if (arr[i]==m)neg++;
        System.out.println();
        System.out.println("There are " +neg+ " instances of " +m);
    }     
}