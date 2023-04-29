import java.util.*;
import java.util.ArrayList;
public class skipachar {
    public static void main(String[] args)
    {
        String s="redapple";
        String p="apple";
        char c='a';
        int a=0;
       System.out.println( fun(s,c,a,new ArrayList<>()));
        System.out.println(skipstr(s,p));

    }

    private static ArrayList<Character>fun(String s, char c, int a, ArrayList <Character> list) {
        char[] ch=s.toCharArray();

        if(a==ch.length)
        {
            return list;
        }
        if(ch[a]!=c) {
            list.add(ch[a]);
        }
        return fun(s,c,a+1,list);
    }
    public static String skipstr(String s,String p)
    {
        if(s.isEmpty())
    {
        return "";
    }
    if(s.startsWith(p))
    {
        return skipstr(s.substring(p.length()),p);
    }
    else {
        return s.charAt(0)+skipstr(s.substring(1),p);
    }

    }
}
