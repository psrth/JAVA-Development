import java.util.Scanner;

public class RecFact
{
  int r;
  int n;

  public void RecFact()
  {
    r = 0;
    n = 0;

  }

  public void readNum()
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value of 'n': ");
    n = sc.nextInt();

    System.out.print("Enter value of 'r': ");
    r = sc.nextInt();
  }

  public int factorial(int x)
  {
    if(x>=1)
    {
      return x*factorial(x-1);
    }

    else
    {
      return 1;
    }
  }

  public void factSeries()
  {
    int factSeries = factorial(n)/(factorial(r)*factorial(n-r));
    System.out.println(factSeries);
  }

  public static void main(String args[])
  {
    RecFact rf = new RecFact();

    rf.RecFact();
    rf.readNum();
    rf.factSeries();
  }
}
