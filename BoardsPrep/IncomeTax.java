package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2012 - Q5

import java.util.Scanner;

public class IncomeTax {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        char gender;
        int age=0;
        double income=0.0;
        double tax=0.0;
        
        while(true){
            System.out.println("INCOME TAX COMPUTER");
            System.out.print("Enter your age: ");
            age=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your gender(M/F): ");
            gender=sc.next().charAt(0);
            System.out.print("Enter your annual income: ");
            income=sc.nextDouble();
            
            if(gender=='F'||gender=='f'||age>65){
                System.out.println("wrong category");
                break;
            }
            
            if(income<160000)tax=0.0;
            if(income>160000.0 && income<=500000.0)
                tax=(income-160000.0)*0.1;
            else if(income>500000.0 && income<=800000.0){
                tax=(income-500000.0);
                tax*=0.2;
                tax+=34000.0;
            }
            else if(income>800000.0){
                tax=income-800000.0;
                tax*=0.3;
                tax+=94000.0;
            }
            
            System.out.print("Income Tax is Rs."+tax);
            break;
        }
    }
}
        