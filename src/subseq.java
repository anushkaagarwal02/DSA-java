public class subseq {
    public static void main(String[] args)
    {  sub("a","anushka");

    }
    public static void sub(String p,String v)
    {
        if(v.isEmpty())
        {
            System.out.println(p);
            return;
        }
            char c=v.charAt(0);
            sub(p+c,v.substring(1));
           sub(p,v.substring (1));
      sub(p+(c+0),v.substring(1));
        }
    }
