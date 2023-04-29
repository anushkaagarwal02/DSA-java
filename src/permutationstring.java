public class permutationstring {
    public static void main(String[] args) {
        perm("", "abc");
    }

    public static void perm(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
            char c = up.charAt(0);
            for (int i = 0; i <= p.length() ; i++) {
                String f=p.substring(0,i);
                String g=p.substring(i,p.length());
                perm(f+c+g,up.substring(1) );
        }
    }}
