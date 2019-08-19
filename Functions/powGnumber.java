package Functions;
import java.util.Scanner;
public class powGnumber{
    public static int powered(int a, int b) {
        int ans=1;
        for (int i = 0; i<b; i++) ans = ans*a;
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the base and the power.");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = powered(x,y);
        System.out.println(z); 
               
    }
}
