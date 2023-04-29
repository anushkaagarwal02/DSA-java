public class allpossibleseq {
    public static void main(String[] args)
    {
        String s="abc";
        process("",s);
    }
    public static void process(String u,String p)
    {  if(p.isEmpty())
    {
        System.out.println(u);
        return;
    }
        char c=p.charAt(0);
        process(u,p.substring(1));
        System.out.println("y");
        process(u+c,p.substring(1));

    }
}
