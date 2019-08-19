package numberManipulation;

import java.util.Scanner;
public class digitCounter{
    public static void main(String args[]){
        int y=8;
        y+= ++y + y-- + --y;
        System.out.print(y);
    }
}