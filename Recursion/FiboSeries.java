// Program to print Fibonacci Series upto n terms
// Version: 1.0.2
// Date: 23.7.2019
// Author: Parth Sharma

import java.util.Scanner;

public class FiboSeries
{

  int n1 = 0;
  int n2 = 1;
  int n3 = 0;

    public static void main(String args[])
    {

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter number of terms: ");
      int num = sc.nextInt();

      System.out.print(n1+" "+n2);
      printFibo(num-2);

    }

    public static void printFibo(int n)
    {
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;

      System.out.print(" "+n3);
      printFibo(n-1);
    }
}
