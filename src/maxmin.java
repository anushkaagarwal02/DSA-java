import java.util.*;
public class maxmin {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the elements  in array");
        int a=s.nextInt();
        System.out.println("enter the elements if the array");
        int arr[]=new int[a];
        int j=0;
        while(j<a)
        {
            arr[j]=s.nextInt();
            j++;
        }
        int l=arr[0];
        int h=arr[a-1];
        for(int i=0;i<a;i++) {
            if (arr[i] < l) {
                l = arr[i];
            } else if (arr[i] > h) {
                h = arr[i];
            }
        }
        System.out.println("max:"+h+"min"+l);
        }
}
