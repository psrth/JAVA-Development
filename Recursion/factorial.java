// Program to calculate factorial of an input recursively
// Version: 1.0.2
// Date: 23.7.2019
// Author: Parth Sharma

import java.util.Scanner;

public class Factorial
{


  public static int fact(int n)
  {
      if (n>=1)
        return n*fact(n-1);

      else
        return 1;
  }


  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int i = sc.nextInt();

    int f = fact(i);

    System.out.println("The factorial of "+i+" is: "+f);
  }


}
