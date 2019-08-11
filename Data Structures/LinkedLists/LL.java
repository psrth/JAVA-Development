import java.util.Scanner;

public class LL
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();

    System.out.print("Enter the number of elements in initial linked list: ");
    int lim = sc.nextInt();

    for(int i = 0; i<lim; i++)
    {
      System.out.print("Enter data for node "+(i+1)+": ");
      int n = sc.nextInt();

      list.insert(n);
    }

    while(true)
    {
      System.out.println();
      System.out.println("1. See List \n2. Insert Node \n3. Insert Node At Start \n4. Exit Program");
      int menu_input = sc.nextInt();

      if(menu_input==1)
      {
        list.show();
      }

      else if(menu_input==2)
      {
        System.out.print("Enter value for node: ");
        int node_input = sc.nextInt();
        list.insert(node_input);
      }

      else if(menu_input==3)
      {
        System.out.print("Enter value for node: ");
        int node_input = sc.nextInt();
        list.insertAtStart(node_input);
      }

      else if(menu_input==4)
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
