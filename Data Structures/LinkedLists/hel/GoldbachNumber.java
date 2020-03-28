// Program to check for a Goldbach Number
// Parth Sharma, 7.02.20

import java.util.Scanner;

public class GoldbachNumber
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        int p = 3;
        int q = 0;
        
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        System.out.println("Prime pairs are: ");
        while (num > p)
        {
            q = num - p;
            
            if (isPrime(p) && isPrime(q) && p <= q)
            {
                System.out.print(p+" ,"+q);
                System.out.println();
            }
            
            p += 2;
        }
    }
    
    public static boolean isPrime (int n)
    {
        // variable to count number of factors
        int f = 0;
        
        // loop to check for variables
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                f++;
        }
        
        // isPrime
        if (f == 2)
            return true;
            
        else
            return false;
    }
}