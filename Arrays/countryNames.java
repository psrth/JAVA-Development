package Arrays;
//Create an array to store names of ten countries and display them.
import java.util.Scanner;
public class countryNames {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        String arr[] = new String[10];
        for (int i=0;i<10;i++) {
            System.out.print("Enter country name " +(i+1)+ " : ");
            arr[i] = sc.nextLine();
        }
        System.out.println();
        for (int i=0;i<10;i++) System.out.print(arr[i]+ ", ");
    }     
}