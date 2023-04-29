public class sqert {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(sq(a));
    }

    public static double sq(int a) {
        int s = 0;
        int e = a;
        double root=0.0;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m * m == a) {
                return m;
            }
            if (m * m < a) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        double in=0.1;
        for(int i=0;i<1;i++)
        {
            while(root*root<=a)
            {
                root+=in;
            }
            root-=in;
            in/= 10;
        }

        return root;

    }}
