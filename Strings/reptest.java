package Strings;
import java.util.Scanner;

/**
 * Write a description of class reptest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class reptest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class reptest
     */
    public reptest()
    {
        // initialise instance variables
        x = 0;
        //String s = "hello world";
        //s = s.replace(" ", "");
        //System.out.println(s);
        
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
