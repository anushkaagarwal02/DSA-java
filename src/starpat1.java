public class starpat1 {
    public static void main(String[] args)
    {
        pattern(4,1);
    }
    public static void pattern(int r,int c)
    {
        if(r==0)
        {
            return;
        }

        if(c<=r)
        {
            System.out.print("*");
            pattern(r,c+1);
        }
        else
        {
            System.out.println("");
            pattern(r-1,1);
        }
    }
}
