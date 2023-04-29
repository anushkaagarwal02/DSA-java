import java.util.ArrayList;

public class dicelist {
    public static void main(String[] args)
{
    System.out.println(pass("",4));
}
    public static ArrayList<String> pass(String p, int target)
    {
        ArrayList <String> list=new ArrayList<>();
        if(target==0)
        {
         list.add(p);
            return list;
        }
        for(int i=1;i<=6 && i<=target;i++)
        {
            list.addAll(pass(p+i,target-i));
        }
        return list;
    }
}

