public class doublylinklist {
    int size;
    Node head;
    Node tail;
    doublylinklist()
    {
        this.size=0;
    }
    class Node
    {
        int value;
        Node next;
        Node prev;
        Node(int value)
        {
            this.value=value;
        }
        Node(int value,Node next,Node prev)
        {
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
    public void insertf(int value)
    {
        Node n1=new Node(value);
        n1.next=head;
        n1.prev=null;
      if(head!=null)
      {
          head.prev=n1;
      }
      head=n1;
    }
    public void displayr()
    {
        Node n1 = head;
        Node temp = null;
        temp = n1;
            while(temp!=null)
            {   temp=n1;
                n1=n1.next;
            }
        while(temp!=null)
        {

            System.out.print(temp.value+"->");
            temp=temp.prev;
        }
        System.out.println("end");
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {

            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public static void main(String[] args)
    {doublylinklist dll=new doublylinklist();
 dll.insertf(12);
        dll.insertf(22);
        dll.insertf(225);
        dll.insertf(422);
        dll.insertf(202);
        dll.display();
        dll.displayr();
    }
    }

