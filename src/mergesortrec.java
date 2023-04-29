import java.util.Arrays;
public class mergesortrec {
    public static void main(String[] args)
    {

    }
    static int[] merge(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int m=arr.length/2;
        int [] left=merge(Arrays.copyOfRange(arr,0,m));
       int[] right=merge(Arrays.copyOfRange(arr,m,arr.length));
    return merges(left,right);
}

    private static int[] merges(int[] left, int[] right) {
        int [] res=new int[left.length+right.length];
        int i=0;int j=0;int k=0;
        return new int[]{1};
    }
}
