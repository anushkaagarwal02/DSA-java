public class numof1bit {
    public static void main(String[] args)
    {
        long n=1101;
       System.out.println( hammingWeight(n));
    }
        // you need to treat n as an unsigned value
        public static int hammingWeight(long n) {
            int count=0;

            while(n!=0)
            {
                if(n%10==1)
                {
                    count++;
                }
               n=n/10;
            }
            return count;
        }
        }
