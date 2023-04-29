public class twosum {
    public static void main(String[] args)
    {
        int [] nums={2,3,4,5};
        int target=5;
       System.out.println( twoSumm(nums,target));
    }
    public static int[] twoSumm(int[] nums, int target)
    {
        int[] ans=new int[2];
        int i=0;
        while(i<nums.length-1)
        {
            if(nums[i]+nums[i+1]==target)
            {
                ans[0]=i;
                ans[1]=i+1;
              return ans;
            }
            else
            {
                i++;
            }
        }
        return ans;
    }
}
