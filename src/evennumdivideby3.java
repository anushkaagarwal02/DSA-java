public class evennumdivideby3 {
    public static void main(String[] args)
    {int []nums={1, 3, 6, 10, 12, 15};
        System.out.println(averageValue(nums));
    }
        public static int averageValue(int[] nums)
        {
            int count=0;
            int sum=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]%6==0)
                {
                    sum=sum+nums[i];
                    count++;
                    return sum/count;
                }

                else
                {return 0;}
            }
            return count;
        }
    }

