public class palindromestring {
    public static void main(String[] args)
    {
     String s="nitin";
        String p="";
     for(int i=s.length()-1;i>=0;i--)
     {
          p=p+s.charAt(i);
     }
        System.out.print(p);
     if(p.equals(s))
     {
         System.out.println("is palindrome");
     }
     else {
         System.out.println("not palindrome");
     }
    }
}
