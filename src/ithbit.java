import java.util.*;
public class ithbit {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(Integer.toBinaryString(a));
        int n=s.nextInt();
        int z=a>>n;
        int p=z%10;
       System.out.println("the "+n+"th bit of the entered number is"+Integer.toBinaryString(p));

    }
}
