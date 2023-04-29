public class search2darray {
    public static void main(String[] args)
    {
        int[][] a={{2,3,4},{5,6,7}};
        int target=5;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(a[i][j]==target)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
