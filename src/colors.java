public class colors {
    public static void main(String[] args)
    {
        int[] a={1,2,0,1,0,2,1,1};
     for(int i=0;i<a.length;i++)
     {
         for(int j=0;j<a.length;j++)
         {
             if(a[i]<a[j])
             {
                 int temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
         }
     }
     for(int i=0;i<a.length;i++)
     {
         System.out.println(a[i]);
     }
    }
}
