public class factorial {
    public static void main(String[] args)
    {
       System.out.println( fact(5));
    }
    public static int fact(int f)
    {
        if(f==0)
        {return 1;}
        else{
        return f*fact(f-1);

    }}
}
