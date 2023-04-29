public class evennumdigit {
    public static void main(String[] args)
    {
        int[] a={12,345,1,23,87};
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(even(a[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean even(int b) {
 int numod=digits(b);
       if(numod%2==0)
       {
           return true;
       }
       else {
        return false;
    }
}
static int digits(int b)
{       int count=0;
    while (b>0)
    {
        count++;
        b=b/10;
    }
return count;}
}
