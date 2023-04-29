import java.util.Scanner;
public class position {
    public static void main(String args[])
    { Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int count=0;
        while(a>0) {
            count++;
            if (a % 10 == 1)
            {

                System.out.println("the position of the set bit is" +count);
                break;
            }
            else
            {
              a=a/10;
            }
        }
    }
}
