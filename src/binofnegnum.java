import java.util.Scanner;
public class binofnegnum {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        double a = s.nextInt();
        int count=0;
        //System.out.println(Integer.toBinaryString(a));
        while(a!=0)
        {   a=a/10;
            count++;
        }
        double result = (Math.pow(2, count)-1);
       //int z=result^a;
        System.out.println();
    }
}
