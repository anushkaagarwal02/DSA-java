import java.util.*;
public class naive {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string");
        String a=s.next();
        System.out.println("enter the pattern");
        String b=s.next();
        for(int i=0;i<=a.length()-b.length();i++)
        {
            for(int j=0;j<b.length();j++)
            {
                if(a.charAt(i+j)==b.charAt(j))
                {
                    break;

                }
              if(j==b.length())
                {
                    System.out.println("pattern found at index"+i);
                }
            }
        }
    }
}
