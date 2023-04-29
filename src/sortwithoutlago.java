//an array of 0,1,2 is given solve without any sorting algo
public class sortwithoutlago {
    public static void main(String[] args) {
        int[] a = {0, 2, 1, 2, 0, 1, 2, 0, 1};
        int j=0;
        while (j!=a.length) {
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
            }

        }
    }
