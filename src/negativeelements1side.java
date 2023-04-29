public class negativeelements1side {
    public static void main(String[] args) {
        int[] a = {2, -3, 1, 5, -1, 11, 0, -9};
        move(a);
    }

    public static void move(int[] a) {
        int j = 0;
        while (j != a.length) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
            j++;
        }

         for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }}
}