package numberManipulation;

import java.util.Scanner;

public class EvilNumber
{
  int num;
  int binary[] = new int[100];
  int one_count;
  int i = 0;
  
  public void EvilNumber()
  {
    num = 0;
    one_count = 0;
  }

  public void input()
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to EVIL NUMBER checker.");
    System.out.println();
    System.out.print("Enter the number to be checked: ");
    num = sc.nextInt();
  }

  public void decBinary()
  {
    int temp = num;
    
    while(temp>0)
    {
      binary[i] = temp%2;
      temp = temp/2;
      i++;
    }

    System.out.print("BINARY: ");
    for(int j = i-1; j >= 0; j--)
    {
      System.out.print(binary[j]);
    }
  }

  public void checkEvil()
  {
    for(int j = i-1; j >= 0; j--)
    {
      if (binary[j]==1) one_count++;
    }

    System.out.println();
    System.out.println("NUMBER OF ONES: "+one_count);
    if ((one_count%2)==0) System.out.println("It is an EVIL NUMBER.");
    else System.out.println("It is not an EVIL NUMBER.");
  }


  public static void main()
  {
    EvilNumber en = new EvilNumber();

    en.EvilNumber();
    en.input();
    en.decBinary();
    en.checkEvil();
  }
}