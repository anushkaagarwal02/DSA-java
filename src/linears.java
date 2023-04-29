import java.util.Scanner;
public class linears {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("enter the array in which element is to be searched");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b[] = new int[n];
        while (i < n) {
            b[i] = s.nextInt();
            i++;
        }
        System.out.println("enter the number to be searched");
        int a = s.nextInt();
        for(int j=0;j<n;j++) {
            if (b[j] == a) {
                System.out.println(a + "found at index" + j);

        }
    }}
}
