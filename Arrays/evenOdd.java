package Arrays;


import java.util.Scanner;
public class evenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the limit for your array: ");
        System.out.println();
        int lim = sc.nextInt();
        int arr[] = new int[lim];
        for (int i = 0; i<lim; i++){
            System.out.print("Enter data for variable " +(i+1)+" : ");
            System.out.println();
            int init = sc.nextInt();
            arr[i] = init;
            }
        int even=0;
        int odd=0;
        for (int i=0; i<lim; i++){
            if (arr[i]%2==0)even++;
            else odd++;
        }
        System.out.println("There are "+even+" even and "+odd+ " odd numbers.");
        }
}