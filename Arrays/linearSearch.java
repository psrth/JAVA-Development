package Arrays;

import java.util.Scanner;
public class linearSearch {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int num[]=new int[5];
        
        for (int i = 0; i<5; i++) {
            System.out.println("Enter variable "+(i+1)+" :");
            int entry = sc.nextInt();
            num[i] = entry;
            }
        System.out.println("Enter the number you wish to find: ");
        int check = sc.nextInt();
        int counter=0;
        for (int i = 0; i<5; i++) {
            if (check ==num[i]) {
                System.out.println("Found. It is at "+(i+1));
                break;
            }
            else if (i==4) System.out.println("Not found");
            }
          }   
}

/* USING COUNTER METHOD
for (int i = 0; i<5; i++) {
            if (check ==num[i]) {
                System.out.println("Found. It is at "+(i+1));
                break;
            }
            else counter++;
            }
        if(counter==5)System.out.println("not found");
*/ 