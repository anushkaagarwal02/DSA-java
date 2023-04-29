public class binarys {
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        binary(a,6,0,a.length-1);
    }
    public static void binary(int[] a,int t,int l,int h) {
        while (l <= h) {
            {
                int mid = l + (h - l) / 2;
                if (a[mid] == t) {
                    System.out.println("target found at pos" + mid);
                }
                if (t <= a[mid]) {
                    binary(a, t, 0, mid - 1);
                }
                else if(t>a[mid])
                {
                    binary(a, t, mid + 1, h);
                }
            }
        }
    }}