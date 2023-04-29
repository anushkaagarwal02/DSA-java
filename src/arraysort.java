public class arraysort {
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 4, 5,3, 6, 7, 8, 9, 10 };
        System.out.print(sort(arr,0));
    }
    public static boolean sort(int[] arr,int b)
    {
        if(b==arr.length-1)
    {
        return true;
    };
          return arr[b]<arr[b+1]&&sort(arr,b+1);

    }
}