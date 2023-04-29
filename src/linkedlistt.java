public class linkedlistt {
        int size;
        Node tail;
        Node head;
        linkedlistt()
        {
            this.size=0;
        }


        public class Node
        {   int value;
            Node next;
            Node(int value)
            {
                this.value=value;
            }

            Node(int value,Node next)
            {
                this.value=value;
                this.next=next;
            }
        }

        public void insert(int val)
        {

            if(size==0)
            {insertf(val);}
            else
            {
                insertl(val);
            }
        }

        public void insertf(int val)
        {
            Node n1=new Node(val);
            n1.next=head;
            head=n1;
            size++;
        }
        public void insertl(int value)
        {
            Node n2=new Node(value);
            Node temp1=head;

            while(temp1.next!=null)
            {

                temp1=temp1.next;
            }
            temp1.next=n2;
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
    {
        linkedlistt l=new linkedlistt();
        l.insert(22);
        l.insert(29);
        l.insert(20);
        l.insert(32);
        l.insert(92);
        l.display();
    }
}


