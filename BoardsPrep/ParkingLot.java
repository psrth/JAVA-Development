package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2015 - Q4

import java.util.Scanner;

public class ParkingLot {
    int vno;
    int hours;
    double bill;

    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("PARKING LOT METER");
        System.out.print("Enter the vehicle number: ");
        vno=sc.nextInt();
        System.out.print("Enter number of hours: ");
        hours=sc.nextInt();
    }
    
    public void calculate(){
        if(hours<=1)bill=hours*3;
        else bill=3+((hours-1)*1.5);
    }
    
    public void display(){
        System.out.println("Vehicle Number \t No. of Hours \t Bill Amount");
        System.out.println(vno+"\t"+hours+"\t"+bill);
    }

    public static void main(){
        ParkingLot car1 = new ParkingLot();
        car1.input();
        car1.calculate();
        car1.display();
    }
}

        
    
        
   