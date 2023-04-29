public class linkedlist {
        Node tail;
        Node head;
        int size;
        public  linkedlist()
        {
            this.size=0;
        }
        public void insert(int val) {
            Node n = new Node(val);
            n.next = head;
            head = n;
            if (tail == null) {
                tail = head;
            }
            size += 1;
        }
        public void display()
        {
            Node temp=head;
             while(temp!=null)
             {
                 System.out.println(temp);
                 temp=temp.next;
             }
        }
    public class Node{
        Node next;
        int value;
        public Node(int value)
        {
            this.value=value;
        }
        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
}
