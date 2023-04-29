public class maxod2darr {
    public static void main(String[] args)
    {
        int [][] a={{1,2,3},{4,5,6},{7,8,9}};
        int max=a[0][0];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
