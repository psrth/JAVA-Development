package iterationLoops;
import java.util.Scanner;

public class respaper1{
    public static int sumSeries(int a2, int n){
        /* 
            Method to calculate the sum of the series:
            S=(a-2)-(2a+3)+(3a-4)-(4a+5)...n terms
        */
        int count=1;
        int count2=2;
        int count3=3;
        int sum=0;
        int a =a2;
        
        for (int i=0;i<n;i++){
            sum= sum +(a*count)-count2;
            sum = sum -(count2*a + count3);
            count++;
            count2++;
            count3++;
        }
            
        return sum;
    }
    public static void main(){
        System.out.println(sumSeries(4,5));
    }
}

    
    

        
        