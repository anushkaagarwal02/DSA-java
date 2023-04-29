public class searchinsertpos {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int target = 4;
    pos(nums,target);}
    public static int pos(int[] nums,int target)
    {
        int f = nums[0];
        int l = nums[nums.length-1];
        int m = f + (l - f) / 2;
        if (nums[m] == target) {
            System.out.println(m);
        } else if (nums[m] < target) {
            f = m + 1;
            pos(nums,target);
        } else {
            l = m - 1;
        }
        return l+1;
    }
}
