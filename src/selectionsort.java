public class selectionsort {
    public static void main(String[] args)
    {
        int[] a={2,1,4,5,3};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
                    if (a[i] > max)
                    {
                        max = a[i];
                        int temp = a[a.length - 1 - i];
                        a[a.length - 1 - i] = max;
                        max = temp;
                    }
        }
        for(int k=0;k<a.length;k++)
        {
            System.out.println(a[k]);
        }
    }
}
