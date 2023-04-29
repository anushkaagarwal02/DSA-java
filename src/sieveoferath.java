public class sieveoferath {
    public static void main(String [] args)
    {
        int a=40;
        boolean[] b=new boolean[a+1];
        for(int i=2;i*i<=a;i++)
        {
            if(!b[i])
            {
                for(int j=i*2;j<=a;j+=i)
                {
                    b[j]=true;
                }
            }
        }
        for(int i=2;i<=a;i++)
        {
            if(!b[i])
            {
                System.out.println(i);
            }
        }
    }
}
