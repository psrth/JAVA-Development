package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2016 - Q4

import java.util.Scanner;
public class BookFair {
    String bname;
    double price;

    BookFair(){
        bname="";
        price=0.0d;
    }

    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the book: ");
        bname = sc.nextLine();
        System.out.print("Enter the price: ");
        price = sc.nextDouble();
    }
    
    public void calculate(){
        if(price<=1000)price*=0.98;
        else if(price>3000)price*=0.85;
        else price*=0.9;
    }
        
    public void display(){
        System.out.println(bname);
        System.out.println(price);
    }

    public static void main(String args[]){
        BookFair b1 = new BookFair();
        b1.Input();
        b1.calculate();
        b1.display();
    }
}

        
                
        
