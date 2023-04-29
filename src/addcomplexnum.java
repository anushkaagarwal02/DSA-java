class addcomplexnum{
    int r,i;
    public addcomplexnum(int r,int i)

    {
        this.r=r;
        this.i=i;
    }
    public void display()
    {
        System.out.println(this.r+"+"+"i"+this.i);
    }
    public static void main(String[] args) {
        addcomplexnum c1 = new addcomplexnum(2, 3);
        addcomplexnum c2 = new addcomplexnum(4, 5);
        addcomplexnum res = add(c1, c2);
        res.display();
    }

    public static addcomplexnum add(addcomplexnum c1,addcomplexnum c2)
    {
        addcomplexnum res=new addcomplexnum(0,0);
        res.r=c1.r+c2.r;
        res.i=c1.i+c2.i;
        return res;

    }
}