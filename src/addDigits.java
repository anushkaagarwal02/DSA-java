public class addDigits {
    public static void main(String[] args) {
        int n = 29;
        int count = 0;
        int z = n;
        int sum = 0;
        int k = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        while (count!=1) {
            if (count == 0) {
                System.out.println(0);
            } else if (count == 1) {
                System.out.println(n);
            } else {
                for (int i = 0; i <= count; i++) {
                    k = z % 10;
                    sum = sum + k;
                    z = z / 10;
                }
                System.out.println(sum);
            }
        }
    }
}
