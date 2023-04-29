public class setbit {
   public  static int  counter(int n,int count)
    {
        if(n<=0)
        {
            return count;
        }
        else {
            if(n%10==1)
            {

                return counter(n/10,count+1);
            }
            else
                return counter(n/10,count);
        }
    }
    static public void main(String[] args) {
      int a = 6;
       /* while(a!=0)
        {
        int rem=a%10;
        if(rem==1)
        {
            c++;
        }
        a=a/10;
    }*/
    System.out.println(counter(a,0));}}