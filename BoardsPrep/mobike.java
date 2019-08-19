package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2011 - Q4

import java.util.Scanner;

public class mobike {
    int bno;
    int phno;
    String name;
    int days;
    int charge;
    
    public void input(){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the bike's number: ");
        bno=sc.nextInt();
        System.out.print("Enter your phone number: ");
        phno=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name: ");
        name=sc.nextLine();
        System.out.println("Enter the number of days: ");
        days=sc.nextInt();
    }
    
    public void compute(){
        if(days<=5)
            charge=days*500; 
        else if(days>5 && days<=10)
            charge=5*500+(days-5)*400;
        else if(days>10)
            charge=5*500+5*400+(days-10)*200;
    }
    
    public void display(){
        System.out.println("Bike No. \t Phone No. \t Name \t No. of days \t Charge");
        System.out.println(bno+"\t"+phno+"\t"+name+"\t"+days+"\t"+charge);
    }
    
    public static void main(){
        mobike m1=new mobike();
        m1.input();
        m1.compute();
        m1.display();
    }
}
