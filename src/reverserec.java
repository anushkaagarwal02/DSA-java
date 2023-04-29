public class reverserec {

        public static int reverse(int f)
        {int rem=0;
            while(f>0){
               rem= (rem*10)+f%10;
               f=f/10;
            }
        return rem;}
    public static void main(String[] args) {
            int rem;
        System.out.println(reverse(219));
    }
    }



