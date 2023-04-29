//Find the maximum and minimum element in an array
public class minmaxarr {
    public static void main(String[] args) {
        int[] a = {2, 6, 4, 8, 9};
        int max = a[1];
        int min = a[0];
        int i = 0;
        while (i +1<= a.length-1) {
            if (a[i] > a[i + 1]) {
                min = a[i+1 ];
            }
            else
            {
                min=a[0];
            }
            if (a[i] < a[i + 1])
            {
                max = a[i+1];
            }
            else
            {
                max=a[1];
            }
            i++;

        }
        System.out.println(min+" "+max);
    }
}