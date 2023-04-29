public class missingnum {
    public static void main(String[] args) {
        int[] a = {0, 1, 5, 2};
        sort(a);

    }
    public static int sort(int[] a)
    {
        int i=0;
        while(i<a.length)
        {
        int correct=a[i];
            if(a[i]<a.length && a[i]!=a[correct])
            {
                swap(a,i,correct);
            }
            else {
                i++;
            }

        }
        for(int j=0;j<a.length;j++)
        {
            if(a[j]!=j)
            {
                System.out.println(j);
            }}
                return a.length;
            }

    public static void swap(int a[],int i,int c)
    {
        int temp=a[i];
        a[i]=a[c];
        a[c]=temp;
    }
}
