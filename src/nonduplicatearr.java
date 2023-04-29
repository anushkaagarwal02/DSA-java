import java.util.*;
public class nonduplicatearr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = s.nextInt();
        }
        int c = 0;
        for (int j : b) {

            c ^= j;
        }
        System.out.println(c);
    }
}