public class pos {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(poss(nums, target));
    }

    public static int[] poss(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == target) {
                return new int[]{i, i + 1};
            }
                i++;
        }
        return new int[]{-1, -1};
    }
}