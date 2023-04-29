public class kadanesalgo {
    public static void main(String[] args)
    {
        int[] a={-1,-2,-3,-4};
        maxsum(a);
    }
    public static void maxsum(int[] a)
    { int max=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        int maxval=0;
        int h=0;
        for(int i=0;i<a.length-1;i++) {
            maxval += a[i];
            if (maxval > max) {
                max = maxval;

                end = i;
                start = h;
            }
            if (max < 0) {
                max = 0;
                h = i + 1;
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

