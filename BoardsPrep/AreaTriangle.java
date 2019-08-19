package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2014 - Q7

import java.util.Scanner;
import java.lang.Math;
    
public class AreaTriangle {
    public static double area(double a, double b, double c){
        double s=0,area=0;
        s=(a+b+c)/2;
        area=s*(s-a)*(s-b)*(s-c);
        area=Math.sqrt(area);
        return area;
    }
    
    public static double area(int a, int b, int height){
        int area;
        area=((a+b)*height)/2;
        return area;
    }
    
    public static double area(double diagonal1, double diagonal2){
        double area;
        area=(diagonal1*diagonal2)/2;
        return area;
    }
}