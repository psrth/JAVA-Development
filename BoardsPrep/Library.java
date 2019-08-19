package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2012 - Q4

import java.util.Scanner;

public class Library {
    int acc_num;
    String title;
    String author;
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter account number:");
        acc_num=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter book title: ");
        title=sc.nextLine();
        System.out.print("Enter book author: ");
        author=sc.nextLine();
    }
    
    public void compute(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the no. of day(s) late:");
        int days=sc.nextInt();
        int fine=2*days;
        
        System.out.println("The charged fine is "+fine);
    }
        
    public void display(){
        System.out.println("Accession Number      Title        Author");
        System.out.println(acc_num+"\t"+title+"\t"+author);
    }
    
    public static void main(){
        Library b1=new Library();
        
        b1.input();
        b1.compute();
        b1.display();
    }
}




        