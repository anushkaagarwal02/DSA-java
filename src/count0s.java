public class count0s {
    public static void main(String[] args)
    {
        System.out.println(z(102001));
    }
    static int z(int a){
        return coount(a,0);
    }
    private static int coount(int a,int c)
    {
        if(a==0)
        {
            return c;
        }
        int rem=a%10;
            if(rem==0)
            {
                return coount(a/10,c+1);
            }

               return coount(a/10,c);

    }
}
