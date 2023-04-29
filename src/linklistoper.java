public class linklistoper {
    public static void main(String args[])
    {
        ll l=new ll();
        l.insertf(3);
        l.insertf(5);
        l.insertf(6);
        l.insertf(9);
        l.insertf(13);
        l.insertl(23);
        l.insertp(12,3);
        l.display();
        System.out.println(l.deletef());
  l.display();
        System.out.println(l.deletel());
        l.display();
        System.out.println(l.deletep(2));
        l.display();
        System.out.println(l.find(9));
    }
}
