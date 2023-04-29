import java.util.Scanner;
public class gcd {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=a;
        int d=b;
        while(b!=0 && a>b)
        {
            int r=a%b;
            a=b;
            b=r;
        }
        System.out.println("gcd of"+c+"  "+d+"is"+a);
        System.out.println("lcm of a and b is"+(c*d)/a);
    }

}
