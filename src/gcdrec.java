public class gcdrec {
public static void main(String[] args)
{
   System.out.println( gcd(4,2));
}
public static int gcd(int a,int b)
{
    if(b==0)
    {
        return a;
    }
    if(a>b)
    {
        int r=a%b;
        return gcd(b,r);
    }
    return a;
}}
