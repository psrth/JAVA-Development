
public class LinkedList
{
  Node head;
  //linked list starts with a head node

  // method to insert a new node with individual parameters
  public void insert (int data)
  {
    Node node = new Node();
    node.data = data;
    node.next = null;
    //creating new node object with parameters

    if (head==null)
    {
      head = node;
      //if this is first node to be added, it is the head node
    }

    else
    {
      //assuming that n number of nodes are already present, n!=0

      Node n = head;
      //start the traversing from head node

      //loop to move through nodes when node is not last node
      while(n.next!=null)
      {
        n = n.next;
        //node++
      }

      n.next = node;
      //at the end, the next node is the node to be added
    }
  }

  //method to show all data held by linked list of nodes
  public void show()
  {
    Node node = head;
    //start the traversing from head node
    while(node.next!=null)
    {
      System.out.print(node.data+" ");
      node = node.next;
      //print node and node++
    }

    System.out.print(node.data);
    //print last node
  }

  public void insertAtStart(int data)
  {
    Node node = new Node();
    node.data = data;
    node.next = head;

    head = node;
  }

  public void insertAt(int index, int data)
  {
    Node node = new Node();
    node.data = data;
    node.next = null;

    Node n = head;

    if(index==0)
    {
      insertAtStart(data);
      return;
    }

    else
    {
      for(int i = 0;i<(index-1);i++)
      {
        n = n.next;
      }

      node.next = n.next;
      n.next = node;
    }
  }

  public void deleteAt(int index)
  {
    Node n = new Node();
    Node n1 = new Node();
    n1.next = null;

    if(index==0)
    {
      head = head.next;
    }

    else
    {
      Node n = head;
      for(int i=0; i<index-1;i++)
      {
        n = n.next;
      }
      n1 = n.next;
      n = n1.next;
    }

  }
}
