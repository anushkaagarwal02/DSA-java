import java.util.*;
public class setbit1 {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            System.out.println(Integer.toBinaryString(a));
            int n = s.nextInt();
            int y=((1<<n)&a);
            System.out.println(Integer.toBinaryString(y));
        }
    }

