public class newtinsqrt {
    public static void main(String args[]) {
        int n = 8;
       System.out.println(sq(n));
    }
    public static int sq(int n){
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = Math.round(root);
        }
      return (int) x;
    }}
