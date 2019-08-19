package numberManipulation;
import java.util.Scanner;

public class palindrome extends duckme {
    public void checkPal(int num){
        int b = num;
        int tmp=0;
        int rvs=0;
        while(b>0){
            tmp=b%10;
            rvs=rvs*10+tmp;
            b=b/10;
        }
        if (rvs==num)
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}
           
            
        
        