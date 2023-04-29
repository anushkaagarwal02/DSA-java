public class fibonacci {
    public static void main(String[] args)
    {
        int a1=0;
        int a2=1;
        int n=3;
        for(int i=0;i<n;i++)
        {
            int temp=a2;
            a2=a1+a2;
            a1=temp;

            System.out.println(a2);
        }
    }
}
