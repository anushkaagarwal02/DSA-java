public class linklist {
    Node head;
    Node tail;
    int size;

    public linklist() {
        this.size = 0;
    }

    public void insert(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
        size++;
    }
    public void insertval(int val) {
        if(tail==null)
        {
            insert(val);
            return;
        }
        Node n1 = new Node(val);
        tail.next = tail;
        tail= n1;
        size++;
    }
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }

    }
        public class Node {
            int value;
            Node next;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next) {
                this.next = next;
                this.value = value;
            }


        }
    }


