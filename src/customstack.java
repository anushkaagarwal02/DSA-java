public class customstack {
    int [] val;
   public static final int size=10;
   int ptr=-1;
customstack() {
    this(size);
}
public customstack(int size)
{
    this.val=new int[size];
}
public boolean push(int data) throws Exception

{
    if(isfull())
    { throw new Exception("stack full");
    }
    ptr++;
    val[ptr]=data;
    return true;

}
public int pop() throws Exception
{
    if(isempty())
    {throw new Exception("stack empty");

    }

   int popped= val[ptr];
    ptr--;
    return popped;
}
public int peek()
{ if(isempty())
{
    System.out.println("stack empty");
}
    return val[ptr];
}
public  boolean isfull()
{
   return ptr==val.length-1;
}
    public  boolean isempty()
    {
        return ptr==-1;
    }
    public static void main(String[] args) throws Exception
    {
        customstack cs=new customstack(5);
        cs.push(5);
        cs.push(15);
        cs.push(25);
        cs.push(35);

        System.out.println(cs.pop());
        System.out.println(cs.peek());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());

    }
}
