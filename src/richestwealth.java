public class richestwealth {
    public static void main(String[] args)
    { int[][] a={{2,3,4},{5,4,6},{6,1,2}};
     System.out.println(summ(a) ) ;
    }
    public static int summ(int[][] a)
    { int ans=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        { int sum=0;
            for(int j=0;j<a[i].length;j++)
            {
                sum+=a[i][j];
            }
            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;
    }
}
