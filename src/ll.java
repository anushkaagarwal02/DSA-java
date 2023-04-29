public class ll {
    private Node head;
    private Node tail;
    private int size;

    ll() {
        this.size = 0;
    }
 public void insertf(int value)
 {
     Node n=new Node(value);
     n.next=head;
     head=n;
     if(tail==null)
     {
         tail=head;
     }
     size+=1;
 }
 public void insertl(int value)
 {
     if(tail==null)
     {
         insertf(value);
         return;
     }
     Node n1=new Node(value);
     tail.next=n1;
     n1=tail;
     size+=1;
 }
 public void insertp(int value,int index)
 {
     if(index==0)
     {
         insertf(value);
     }
  if(index==size)
  {
      insertl(value);
  }

  Node temp2=head;
  for(int i=0;i<index;i++)
  {
      temp2=temp2.next;
  }
     Node n2=new Node(value,temp2.next);
     {
         temp2.next=n2;
     }
     size++;
 } 
 public int deletef()
 { int tempp=head.value;
     head=head.next;
     if(head==null)
 {
     tail=null;
 }
     size--;
     return tempp;
 }
 public Node get(int index)
 {
     Node n=head;
     for(int i=0;i<index;i++)
     {
         n=n.next;
     }
     return n;
 }
 public int deletel()
 {
     if(size<=1)
     {
         return deletef();
     }
     Node sl=get(size-2);
     int val=tail.value;
     tail=sl;
     tail.next=null;
     size--;
     return val;

 }
 public int deletep(int pos)
 { if(pos==0)
 {
     return deletef();
 }
 if(pos==size-1)
 {
     return deletel();
 }
 Node n=get(pos-1);
     int val=n.next.value;
     n.next=n.next.next;

     size--;
     return val;
 }
 public Node find(int value)
 {
     Node temp3=head;
     while(temp3!=null)
     {
         if(temp3.value==value)
         {
             return temp3;
         }
         else {
             temp3=temp3.next;
         }
     }
     return null;
 }
 public void display()
 {
     Node temp=head;
     while(temp!=null)
     {
         System.out.print(temp.value+"->");
         temp=temp.next;
     }
     System.out.print("END");
 }
    class Node {
        public int node;
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}