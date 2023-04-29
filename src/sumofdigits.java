public class sumofdigits {
        public static void main(String[] args)
        {
            System.out.println( sum(423));
        }
        public static int sum(int f)
        {
            if(f==0)
            {return 0;}
            else{
                return f%10+sum(f/10);

            }}
    }


