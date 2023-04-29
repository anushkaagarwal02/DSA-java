public class addcomplex {
    int r;
    int i;
    public addcomplex(int r,int i)
    {
        this.r=r;
        this.i=i;
    }
    public void display()
    {
        System.out.println(this.r+"+"+"i"+this.i);
    }
    public static void main(String[] args)
    {
        addcomplex a1=new addcomplex(2,3);
        addcomplex a2=new addcomplex(2,3);

        addcomplex res=add(a1,a2);
        res.display();
    }
    public static addcomplex add(addcomplex a1,addcomplex a2)
    {
        addcomplex res=new addcomplex(0,0);
        res.r=a1.r+a2.r;
        res.i=a1.i+a2.i;
        return res;
    }
}
