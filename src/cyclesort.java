import java.util.Arrays;
public class cyclesort {
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 3, 4};
        sort(a);
            System.out.println(Arrays.toString(a));

    }

    public static void sort(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[i] != a[correct]) {
                swap(a, i, correct);
            }
            else {
                i++;
            }

        }
        }
        public static void swap ( int[] a, int i, int k)
        {
            int temp = a[i];
            a[i] =a[ k];
            a[k] = temp;
        }

}