public class recsum {
    public static void main(String[] args)
    {
        System.out.println( fact(4));
    }
    public static int fact(int f)
    {
        if(f==0)
        {return 0;}
        else{
            return f+fact(f-1);

        }}
}
