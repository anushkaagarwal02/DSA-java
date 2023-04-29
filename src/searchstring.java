public class searchstring {
    public static void main(String[] args)
    {
        String a="anushka";
        char target='u';
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==target)
            {
                System.out.println(i);
            }

                System.out.println("not found");

        }
    }
}
