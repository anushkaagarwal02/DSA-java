public class infinitearrbin {
    public static void main(String[] args)
    {
        int[] a={3,5,7,9,10,90,100,130,140,160,180};
      System.out.println( ans(a,10));
    }
    public static int ans(int [] a,int t)
    {
        int s=0;
        int e=1;
        while(a[e]<t)
        {int news=e+1;
        e=e+(e-s+1 )*2;
        s=news;
        }
        return find(a,t,s,e);
    }
    public static int find(int [] a, int t, int s, int e) {
        while (s <= e) {
         int mid = s + (e - s) / 2;
            if (t <a[mid]) {
                e = mid - 1;
            }
            else if (t > a[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }}