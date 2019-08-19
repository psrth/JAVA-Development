package Arrays;


import java.util.Scanner;
public class posiNegi {
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
        int pos=0;
        int neg=0;
        for (int i=0; i<lim; i++){
            if (arr[i]<0)neg++;
            else pos++;
        }
        System.out.println("There are "+pos+" positive and "+neg+ " negative numbers.");
        }
}