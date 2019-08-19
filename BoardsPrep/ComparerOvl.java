package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2011 - Q7

public class ComparerOvl {
    public void compare(int n, int m){
        if (n>m)System.out.println(n);
        else System.out.println(m);
    }
    
    public void compare(char a, char b){
        int ad=(int)a;
        int bd=(int)b;
        if (ad<bd)System.out.println(a);
        else System.out.println(b);
    } 
    
        
    public void compare(String x, String y){
        int a=x.length();
        int b=y.length();
        if (a>b)System.out.println(x);
        else System.out.println(y);
    }
}
    