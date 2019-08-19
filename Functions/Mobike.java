// ------PROJECT MOBIKE------
// VERSION 1.2.1
// ICSE Board Preparation, 2018
// author: Parth Sharma


package Functions;
import java.util.Scanner;


public class Mobike{

    int bno;
    int phno;
    String name;
    int days;
    int charge;
    
    public void input(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your bike number: ");
        bno = sc.nextInt();

        System.out.println("Enter your phone number: ");
        phno = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Enter number of days: ");
        days = sc.nextInt();
    }
    

    public void compute(){
        if (days<=5)
            charge=500*days;
        if (days>10)
            charge=(500*5)+(400*5)+((days-10)*200);
        else 
            charge=(500*5)+((days-5)*400);
    }
    





    public void display(){
        System.out.print("Bike No. \t Phone No. \t Name ");
        System.out.println("\t No. of Days \t Charge");
        System.out.print(bno+"\t"+phno+"\t"+name+"\t");
        System.out.println(days+"\t"+charge);
    }
  

    public static void main(String args[]){
        Mobike b1 = new Mobike();
        b1.input();
        b1.compute();
        b1.display();
    }
}

/* SAMPLE INPUT 
    Bike Number:     526532
    Phone Number:    456322 (int)
    Name:            Parth Sharma
    Days:            7

    OUTPUT
    Fare: 3300
*/

    