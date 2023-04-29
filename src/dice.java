public class dice {
    public static void main(String[] args)
    {
        pass("",4,6);
    }
    public static void pass(String p,int target,int k)
    {int count=0;
        if(target==0)
        {
            System.out.println(p);
            return;
        }
        for(int i=1;i<=k && i<=target;i++)
        {   count++;
            pass(p+i,target-i,k);
        }
        System.out.println(count);
    }
}
