import java.util.Arrays;
public class selectionsortrec {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 1, 3};
        sort(arr,0, arr.length , 0);
        System.out.println(Arrays.toString(arr));}

    public static void sort(int[] arr,int s, int e, int max) {
        if (e == 0) {
            return;
        }
        if(s<e) {
            if (arr[s] > arr[max]) {
                sort(arr, s + 1, e, s);
            } else {
                sort(arr, s + 1, e, max);
            }
        }else {
            int temp=arr[max];
          arr[max]  =arr[e-1];
            arr[e-1]=temp;
             sort(arr,0,e-1,0);
         }

        }

    }
