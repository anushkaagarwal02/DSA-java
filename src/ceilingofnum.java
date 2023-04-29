public class ceilingofnum {
    public static void main(String[] args) {
        int[] a = {2, 3, 5,9,14,16,18};
        ceiling(a, 0, a.length - 1, 15);
    }
    public static void ceiling(int[] a, int s, int e, int t) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (t < a[m]) {
                ceiling(a, s, m - 1, t);
            } else if (t > a[m]) {
                ceiling(a, m + 1, e, t);
            } else {
                System.out.println(m);
            }
        }
        System.out.println(a[s]);
    }
}