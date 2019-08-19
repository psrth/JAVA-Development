package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2013 - Q4

import java.util.Scanner;

public class FruitJuice {
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;
    
    public void FruitJuice(){
        this.product_code=0;
        this.pack_size=0;
        this.product_price=0;
        this.flavour="";
        this.pack_type="";
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the product code: ");
        product_code=sc.nextInt();

        System.out.println("Enter the flavour: ");
        flavour=sc.nextLine();
        
        System.out.println("Enter the pack type: ");
        pack_type=sc.nextLine();

        System.out.println("Enter the pack size(in ml): ");
        pack_size=sc.nextInt();
        
        System.out.println("Enter the product_price: ");
        product_price=sc.nextInt();
    }

    public void disount(){
        product_price-=10;
    }
    
    public void display(){
        System.out.println(product_code);
        System.out.println(flavour);
        System.out.println(pack_type);
        System.out.println(pack_size);
        System.out.println(product_price);
    }
}
    
    










