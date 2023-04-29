public class strtoint {
    public static void main(String[] args) {
     System.out.println(multiply("498828660196","840477629533"));
    }

    public static String multiply(String num1, String num2)
    { long result1=0;long result2=0;
        for(int i=0;i<num1.length();i++)
        {
            result1=result1*10+num1.charAt(i)-'0';
        }
        for(int i=0;i<num2.length();i++)
        {
            result2=result2*10+num2.charAt(i)-'0';
        }
       long  r=result1*result2;
        return String.valueOf(r);
    }
}