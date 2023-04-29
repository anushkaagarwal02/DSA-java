public class printnumre {
    public static void main(String[] args) {
        {

            rec(5);
        }
    }

    public static void rec(int a) {
        if(a==0)
        {System.out.println("end");}
        else{
        System.out.println(a);
        rec(a-1);
    }
}}
