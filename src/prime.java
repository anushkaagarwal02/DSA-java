import java.util.*;
public class prime {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a<=1)
        {
            System.out.println("sos");
        }
        else
        {
            int c=2;
            while(c*c<=a)
            {
                if(a%c==0)
                {System.out.println("not prime");
            }
                c++;
        }
    }
}}
