public class charfreq {
    public static void main(String[] args)
    {
        String s="abccedaaefa";
        int [] a=new int[25];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            a[ch-'a']+=1;
        }
        for(int i=0;i<26;i++)
        {
            System.out.println(a[i]);
        }
    }
}
