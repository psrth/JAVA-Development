package boardsPrep;
import java.util.Scanner;

/* AUTHOR: Parth Sharma, 10D ICSE.Board.Paper.2017 - Q4*/
public class ElectricBill {    
    public String n;
    public int units;
    public double bill;
   
    public void accept()    {
        Scanner sc =  new  Scanner(System.in);
        System.out.println("Enter your name: ");
        n = sc.nextLine();
        System.out.println("Enter the units consumed: ");
        units = sc.nextInt();
    }

    public void calculate()    {
        double calc;
        double uni = units;
        if (uni <= 100) {
            calc = uni * 2;
        }
        else if (uni > 300) {
            calc = uni * 5;
            calc = calc * 102.5;
        }
        else {
            calc = uni * 3;
        }
        bill = calc;
    }

     public void print()    {
        System.out.println("Name of the customer " + n);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Bill amount: " + bill);
    }

    static public void main(String[] args){
        ElectricBill e1 =  new  ElectricBill();
        e1.accept();
        e1.calculate();
        e1.print();
    }
}
