import java.util.Arrays;
public class occurences {
    public static void main(String[] args) {
        int[] nums={3,5,-2,-3,-6,-6};
        System.out.println(uniqueOccurrences(nums));
    }
        public static boolean uniqueOccurrences(int[] arr) {
            Arrays.sort(arr);
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i]==arr[i+1])
                {
                    return true;
                }

            }
            return false;
        }

    }

