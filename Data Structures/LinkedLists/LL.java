import java.util.Scanner;

public class LL
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();

    System.out.print("Enter the number of elements in initial linked list: ")
    int lim = sc.nextInt();

    for(int i = 0; i<lim; i++)
    {
      System.out.print("Enter data for node "+(i+1)+": ");
      int n = sc.nextInt();

      list.input(n);
    }

    while(true)
    {
      System.out.println("1. See List \n2. Insert Node");
      int menu_input = sc.nextInt();

      if(menu_input==1)
      {
        list.show();
      }

      else if(menu_input==2)
      {
        System.out.print("Enter value for node: ");
        int node_input = scn.nextInt();
        list.input(node_input);
      }

      else if(menu_input==3)
      {
        return;
      }

      else
      {
        System.out.println("Option not found.");
      }
    }
  }
}
