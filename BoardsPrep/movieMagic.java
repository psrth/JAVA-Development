package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2014 - Q4

import java.util.Scanner;

public class movieMagic {
    int year;
    String title;
    float rating;

    
    public void movieMagic(){
        this.year=0;
        this.title="";
        this.rating=0;
    }
    


    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        year=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of the movie: ");
        title=sc.nextLine();
        System.out.print("Enter the rating: "); 
        rating=sc.nextFloat();
    }



    public void display(){
        System.out.println(title);
        if(rating>=0.0 && rating<=2.0)
            System.out.println("Flop");
        else if(rating>=2.1  && rating<=3.4)
            System.out.println("Semi-hit");
        else if(rating>=3.5 && rating<=4.5)
            System.out.println("Hit");
        else if(rating>=4.6 && rating<=5.0)
            System.out.println("Super Hit");
        else System.out.println("Rating not recognized.");
    }
    






    public static void main(){
        movieMagic m1=new movieMagic();
        m1.movieMagic();
        m1.accept();
        m1.display();
    }
}
        
        
    
        
    