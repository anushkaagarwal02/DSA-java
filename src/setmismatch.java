import java.util.Arrays;
public class setmismatch {

    public static void main(String[] args) {
        int[] a = {2, 1, 5, 2, 4};

        System.out.println( sort(a));

    }

    public static int[] sort(int[] a)
    {
        int i=0;
        while(i<a.length)
        {
            int correct=a[i]-1;
            if(a[i]<a.length && a[i]!=a[correct])
            {
                swap(a,i,correct);
            }
            else {
                i++;
            }

        }
        for(int j=0;j<a.length;j++)
        {
            if(a[j]!=j+1)
            {
                return new int[]{a[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void swap(int a[],int i,int c)
    {
        int temp=a[i];
        a[i]=a[c];
        a[c]=temp;
    }
}
