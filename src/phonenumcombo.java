public class phonenumcombo {
    public static void main(String[] args) {
        combs("", "2");
    }
    public static void combs(String u, String p) {
        if(p.isEmpty())
        {
            System.out.println(u);
            return;
        }
        int c=p.charAt(0)-'1';
        for(int i=(c-1)*3;i<c*3;i++)
        {
            char ch=(char)('a'+i);
            combs(u+ch,p.substring(1));
        }
    }
}