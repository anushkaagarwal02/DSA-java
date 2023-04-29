import java.util.Arrays;

public class containsduplicate {
        public static void main(String[] args) {
            int[] nums={2,14,18,22,22};
Arrays.sort(nums);
            for(int i=0;i<nums.length -1;i++) {

                    if (nums[i] == nums[i+1]) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
            }}


