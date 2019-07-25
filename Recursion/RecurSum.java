// Program to print sum of n natural numbers recursively
// Version: 1.0.2
// Date: 23.7.2019
// Author: Parth Sharma

import java.util.Scanner;
// importing Scanner class

public class RecurSum
{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // new scanner object

    System.out.print("Enter number of terms to be added: ");
    int i = sc.nextInt();
    // user input for number of terms

    int sum = RecurSum(i);
    // function RecurSum on parameter i

    System.out.print("Sum of n natural numbers is: "+sum);
    // printing final sum
  }


  public static int RecurSum(int n)
  {
    if (n>=1)
    {
      return (n + RecurSum(n - 1));
      // recursive case
    }

    else
    {
      return 0;
      // base case
    }
  }
}
