public class countperm {
        public static void main(String[] args) {
            System.out.println(perm("", "abc"));
        }

        public static int perm(String p, String up) {
            if (up.isEmpty()) {

                return 1;
            }
            char c = up.charAt(0);
            int count=0;
            for (int i = 0; i <= p.length() ; i++) {
                String f=p.substring(0,i);
                String g=p.substring(i,p.length());
               count=count+ perm(f+c+g,up.substring(1) );
            }
        return count;}}


