public class Solution {
    public static void main(String[] args)
    {
        int [] arr={40,48,61,75,100,99,98,39,30,10};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int s=0;int e=arr.length-1;
        while(s<e)
        {
            int mid=s+(e-2)/2;
            if(arr[mid]>arr[mid+1])
            {
                e=mid;
            }
            else
            {
                s=mid+1;
            }
        }
        return s;

    }
}

