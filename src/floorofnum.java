public class floorofnum  {
    public static void main(String[] args) {
        int[] a = {2, 3, 5,9,14,16,18};
       floor(a, 0, a.length - 1, 15);
    }
    public static void floor(int[] a, int s, int e, int t) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (t < a[m]) {
                floor(a, s, m - 1, t);
            } else if (t > a[m]) {
                floor(a, m + 1, e, t);
            } else {
                System.out.println(m);
            }
        }
        System.out.println(a[e]);
    }
}
