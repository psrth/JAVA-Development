// ------ WORD HANDSHAKE ------
// Involves two seperate linked string arrays 
// version 1.0.1
// author: Parth Sharma
// ICSE Board Paper, Q9. 2011

package Arrays;
import java.util.Scanner;

public class wordHandshake {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int x=5; 

        String cities[] = new String [x];
        int std[] = new int[x];
        
        for (int i=0;i<x;i++){
            System.out.print("City Number"+(i+1)+" : ");
            String city = sc.nextLine();
            System.out.print("STD Code of "+city+" : ");
            int sdt = sc.nextInt();
            sc.nextLine();
            
            cities[i]=city;
            std[i]=sdt;
        }

        System.out.print("Enter the city name: ");
        String check = sc.nextLine();
        int flag=0;

        for (int i=0;i<x;i++){
            if (cities[i].equalsIgnoreCase(check)){
                System.out.println("City "+check+" found.");
                System.out.println("Its STD is "+std[i]+".");
                flag++;
            }
        }
        
        if (flag==0)
            System.out.println("City not found in database.");
        
    }
}