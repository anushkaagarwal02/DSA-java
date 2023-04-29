public class isomorphicstring {
    public static void main(String[] args)
    {
        String s="aab";
        String t="xxy";
        iso(s,t);
    }
    public static int iso(String s,String t)
    {
        if(s.length()!=t.length())
        {
            return 0;
        }
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<t.length();j++)
            {
                i+=j;
            }
        }
        return 0;
    }
}
