public class ceilingofletter {

    public static void main(String[] args) {
        char[] a = {'a','b','d','e','f'};
        ceiling(a, 0, a.length - 1, 'c');
    }
    public static void ceiling(char[] a, int s, int e, char t) {
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