public class kadanesalgorithm {
    public static void main(String[] args) {
        int[] a = {2, 1, -1, 7, 3, 1};
        int maxval = Integer.MIN_VALUE;
        int max = 0;
        int s = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < a.length-1; i++)
        { max+=a[i];
            if (max > maxval)
            {
                 maxval=max;
                start = s;
                 end = i;
            }
            if(maxval<0)
            {
                maxval=0;
                s=i+1;
            }
        }
        System.out.println("start"+start);
        System.out.println("end"+end);
        System.out.println("max"+max);
        for(int i=start;i<=end;i++)
        {
            System.out.println(a[i]);
        }
    }
}
