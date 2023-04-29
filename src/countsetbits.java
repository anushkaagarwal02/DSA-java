public class countsetbits {
    public static void main(String[] args)
    {
        int a=13;
        int bin=0;
        while(a>1)
        {
            int rem=a%2;
            bin=bin*10+rem;
            a=a/2;
        }
        int count=0;

        while(bin!=0)
        {
            if(bin%10==1)
            {
                count++;
            }
            bin=bin/10;
        }
        System.out.println(count+1);
    }

}
