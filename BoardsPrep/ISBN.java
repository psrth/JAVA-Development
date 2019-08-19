package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2013 - Q5

import java.util.Scanner;

public class ISBN {
   public static void main() {
      Scanner sc=new Scanner(System.in);
        
      while (true){
        int isbn, dupl,rem=0,sum=0,i=0;
    
        System.out.println("UNIVERSAL ISBN CHECKER");
        System.out.println("Enter the ISBN number: ");
        isbn=sc.nextInt();
        dupl=isbn;
        
        double ul=9999999999.0;
        double ll=999999999.0;        
        if(isbn>ll && isbn<=ul);
        else {
            System.out.println("Illegal ISBN");
            break;
        }
        
        while(dupl>0) {
            rem=dupl%10;
            i++;
            sum=sum+rem*i;
            dupl/=10;
        }
        
        if (sum%11==0)System.out.println("Legal ISBN");
        else System.out.println("Illegal ISBN");
        break;
       }
   }
}        

        
    
        
        