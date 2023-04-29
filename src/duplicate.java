public class duplicate {
    public static void main(String[] args) {
        String s = "anushakha";

        for (int i = 0; i < s.length() - 1; i++) {
            char t = s.charAt(i);
            for (int j = i+1; j < s.length() ; j++) {
                char q = s.charAt(j);
                if (t==q)
                {
                    System.out.println(q);
                }
            }
        }
    }
}
