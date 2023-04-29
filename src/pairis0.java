public class pairis0 {
    public static void main(String[] args)
    {
        int[] a={1,3,5,2,-1,-5};
        int count=0;
        for(int i=0;i<a.length;i++)
        { for(int j=i+1;j<a.length;j++)
            if(a[i]+a[j]==0)
            {
                System.out.println(i+""+j);
                count++;
            }
        }
        System.out.println(count);
    }
}
