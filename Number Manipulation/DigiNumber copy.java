package numberManipulation;

import java.util.Scanner;

public class DigiNumber
{
  int num;
  
  public void DigiNumber()
  {
    num = 0;
  }

  public void DigiNumber(int n)
  {
    num = n;
  }

  public void digitFrequency()
  {
    int[] digitCount = new int[10];
    int n = num;
    while (n != 0) 
    {
      int lastDigit = n % 10;
      digitCount[lastDigit]++;
      n = n / 10;
    }

    System.out.println(" ");
    System.out.println("Digits : Frequency");
    System.out.println(" ");

    for (int i = 0; i < digitCount.length; i++) 
    {
      if(digitCount[i] != 0) 
      {
        System.out.println(i+" : "+digitCount[i]);
      }
    }
    System.out.println("");
  }

  public long sumDigits(int n)
  {
    if(n==0)
    {
      return 0;
    }
    
    return (n%10) + sumDigits(n/10);
  }

  void printSum()
  {
    System.out.println(sumDigits(num));
  }

  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    DigiNumber dp = new DigiNumber();

    dp.DigiNumber();

    System.out.print("Enter number: ");
    int input = sc.nextInt();

    dp.DigiNumber(input);
    dp.digitFrequency();
    dp.sumDigits(input);
    dp.printSum();
  }
}