public class ispalindrome {
    public static void main(String args[]) {
        int x= 121;
            String str=String.valueOf(x);
        System.out.println(str);
            String reverse= new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
            if(str.equals(reverse))
                System.out.println("true");
            else
            { System.out.println("false");
        }

    }}
