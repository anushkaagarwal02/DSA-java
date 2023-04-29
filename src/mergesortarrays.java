import java.sql.SQLOutput;
import java.util.Arrays;

public class mergesortarrays {
    public static void main(String[] args)
    {
        int[] arr1 = {1,3, 5, 7};
        int[]  arr2= {0 ,2 ,6 ,8 ,9};
        int k=arr1.length+arr2.length;
        int[] arr=new int[k];
        int p=0;
         for(int i=0;i<arr1.length;i++)
         {
             arr[p]=arr1[i];
             p++;
         }
        for(int i=0;i<arr2.length;i++)
        {
            arr[p]=arr2[i];
            p++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
