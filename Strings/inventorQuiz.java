package Strings;
import java.util.Scanner;

public class inventorQuiz{
    public static void main (String args[]){
        int flag=0;
        for (int i=0; i<3;i++){
            Scanner sc = new Scanner(System.in);
            String name = "James Gosling";
            System.out.println("Who is the developer of JAVA?");
            String entry = sc.nextLine();
            boolean check;
            check = entry.equalsIgnoreCase(name);
            if (check==true){
                System.out.println("Good");
                break;
            }
            else {
                System.out.println("Try Again.");
                flag++;
            }
        }
        if (flag==3)System.out.println("Correct Answer: JAMES GOSLING");
    }
}
