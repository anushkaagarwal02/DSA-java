public class customqueue {
    static int[] val;
    static int ptr=-1;
    public static final int size=5;
    customqueue()
    {
        this(size);
    }
    customqueue(int size)
    {
        this.val=new int[size];
    }
    public boolean isempty()
    {
        return ptr==-1;
    }
    public boolean isfull()
    {
        return ptr==val.length-1;
    }
    public  boolean insert(int data)
    {
        if(isfull())
        {
            return false;
        }
        ptr++;
        val[ptr]=data;
        return true;
    }
    public  int delete() throws Exception
    {
        if(isempty())
        {
            throw new Exception("queue is empty");
        }
        int rem=val[0];
   for(int i=1;i<ptr;i++)
   {
       val[i-1]=val[i];
   }
   ptr--;
        return rem;
    }
    public int front() throws Exception
    {
        if(isempty())
        {
            throw new Exception("queue is empty");
        }
        return val[0];
    }
    public  static void display()
    {
        for(int i=0;i<ptr+1;i++)
        {
            System.out.println(val[i]);
        }
        System.out.println("end");
    }
    public static void main(String[] args) throws Exception
    {
        customqueue cu=new customqueue(5);
        cu.insert(5);
        cu.insert(4);
        cu.insert(3);
        cu.insert(2);
        display();
        System.out.println(cu.delete());
        System.out.println(cu.delete());
    }
}
