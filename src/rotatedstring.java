public class rotatedstring {
    public static void main(String[] args)
    {
        String p="ABCD";
        String q="BDAC";

        for (int i = 0; i < p.length() ; i++) {
            char t = p.charAt(i);
            for (int j = 0; j < q.length() ; j++) {
                char r= q.charAt(j);
                if(t==r)
                {
                    System.out.println("part of string");
                }
                else
                {
                    System.out.println("not rotated");
                }
            }
        }
    }
}
