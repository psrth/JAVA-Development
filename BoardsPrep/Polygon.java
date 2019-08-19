package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2012 - Q7

public class Polygon {
    public void polygon(int n, char ch){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)System.out.print(ch);
            System.out.println();
        }
    }
    
    public void polygon(int x,int y){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++)System.out.print("@");
            System.out.println();
        }
    }
    
    public void polygon(){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++)System.out.print("*");
            System.out.println();
        }
    }
}
            
                
   