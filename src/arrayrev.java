//program to reverse the array
public class arrayrev {
    public static void main(String[] args) {
        int[] a = {2, 6, 4, 8, 9};
        for (int i = a.length - 1; i >= 0; i--) {
            int temp=a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i];
            a[i]=temp;
        }
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]);
        }
    }
}