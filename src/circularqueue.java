public class circularqueue {
    static int[] val;
    public static final int size = 10;
    static int front = 0;
    static int end = 0;
    int sz = 0;

    circularqueue() {
        this(size);
    }

    public circularqueue(int size) {
        this.val = new int[size];
    }

    public boolean isempty() {
        return sz == -1;
    }

    public boolean isfull() {
        return sz == val.length - 1;
    }

    public boolean insert(int data) {
        if (isfull()) {
            return false;
        }
        val[end++] = data;
        end = end % val.length;
        sz++;
        return true;
    }

    public int delete() throws Exception {
        if (isempty()) {
            throw new Exception("queue is empty");
        }
        int rem = val[front];
        front = front % val.length;
        sz--;
        return rem;
    }

    public int front() throws Exception {
        if (isempty()) {
            throw new Exception("queue is empty");
        }
        return val[front];
    }

    public static void display() {
        for (int i = front; i < end; i++) {
            System.out.println(val[i]);
        }
        System.out.println("end");
    }

    public static void main(String[] args) throws Exception {
        circularqueue cu = new circularqueue(5);
        cu.insert(5);
        cu.insert(4);
        cu.insert(3);
        cu.insert(2);
        cu.display();
        System.out.println(cu.delete());
        System.out.println(cu.delete());
    }
}