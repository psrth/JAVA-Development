package Arrays;
//frequency of marks
import java.util.*;
public class marksFrequency {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int[10];
        for (int i=0;i<10;i++) {
            System.out.print("Enter marks in subject " +(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Your marks are : ");
        for (int i=0;i<10;i++) System.out.print(arr[i]+ ", ");
        int sixty = 0;
        int eighty = 0; 
        int middle = 0;
        for (int i=0;i<10;i++){
            if (arr[i] < 60)sixty++;
            else if (arr[i] > 80)eighty++;
            else middle++;
        }
        System.out.println();
        System.out.println("You scored less than sixty marks in "+sixty+ " subjects.");
        System.out.println("You scored more than eighty marks in "+eighty+ " subjects.");
        System.out.println("You scored btw 60 and 80 marks in "+middle+ " subjects.");
    }
}