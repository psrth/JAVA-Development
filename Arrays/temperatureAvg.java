package Arrays;

import java.util.Scanner;
public class temperatureAvg {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of days (or months): ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i =0; i<size;i++) {
            System.out.print("Enter temperature " +(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i =0; i<size; i++) sum = sum + arr[i];
        int avg = sum/size;
        System.out.println(avg);
    }
}