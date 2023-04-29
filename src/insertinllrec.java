public class insertinllrec {
    int size;
    Node head;
    insertinllrec()
    {
        this.size=0;
    }
public class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
public void insert(int value,int index) {
    Node n1 = new Node(value);
    Node temp1 = head;
    if (index == 0) {
        n1.next = head;
        head = n1;
    }
    if (index == 1) {
        temp1.next = n1.next;
        temp1.next = n1;
    }
    else {
        temp1 = temp1.next;
    }
}
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp= temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args)
    {
        insertinllrec re=new insertinllrec();
int index=3;
int value=4;
if(index>0)
re.insert(value,index-1);
        re.display();
    }
}
