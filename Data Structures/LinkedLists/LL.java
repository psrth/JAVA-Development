import java.util.Scanner;

public class LL
{
  public static void main(String args[])
  {
    //creating new scanner and linked list objects
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();

    //setting a base number of nodes
    System.out.print("Enter the number of elements in initial linked list: ");
    int lim = sc.nextInt();

    //initializing base number of nodes
    for(int i = 0; i<lim; i++)
    {
      System.out.print("Enter data for node "+(i+1)+": ");
      int n = sc.nextInt();

      list.insert(n);
    }

    //menu driven user interface
    while(true)
    {
      System.out.println();
      System.out.println("1. Show List \n2. Insert Node at End \n3. Insert Node At Start \n4. Insert Node At \n5. Delete Node \n6. Exit Program");
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
        System.out.print("Enter value for node: ");
        int node_data = sc.nextInt();
        System.out.print("Enter index for node: ");
        int node_index = sc.nextInt();

        list.insertAt(node_index, node_data);
      }

      else if(menu_input==5)
      {
        System.out.print("Enter index to delete node: ");
        int node_index = sc.nextInt();

        list.deleteAt(node_index);
      }

      else if(menu_input==6)
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
