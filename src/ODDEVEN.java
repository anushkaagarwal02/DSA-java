import java.util.*;
public class ODDEVEN {
    public static void main(String[] args)
    { Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if((a&1)==1)
        {
            System.out.println("odd");
        }
        else
        {
            System.out.println("even");
        }
    }
}
