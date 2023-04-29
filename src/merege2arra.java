import java.util.Arrays;
public class merege2arra {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        for (int i = arr1.length; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr1[i] = arr2[j];
            }
            System.out.println(Arrays.toString(arr1));
        }
    }
}