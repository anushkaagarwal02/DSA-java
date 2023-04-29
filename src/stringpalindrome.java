public class stringpalindrome {
    public static void main(String[] args) {
        String s = "nitin";

        palin(s);
    }
    public static void palin( String p) {
        String y=p;
        int z = p.length();
        String j="";
        for (int i=z-1;i>=0;i--)
        {
            j=j+p.charAt(i);
        }
        System.out.print(j);

        if(y.equals(j))
        {
            System.out.println("is palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
