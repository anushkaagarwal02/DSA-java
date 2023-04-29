public class Cyclicallyrotatearray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        cycle(a);
    }
    public static void cycle(int[] a) {
        int i = a.length-1;
        int temp=a[a.length-1];

        while (i >0)
        {
                a[i] = a[i-1];
                i--;
            }
        a[0]=temp;

            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j]);
        }
    }
}