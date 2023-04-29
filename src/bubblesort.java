public class bubblesort {
    public static void main(String[] args)
    {
        int[] a={3,1,2,5,4};
        int  i=0;
        boolean swap;
        while(i<a.length) {
           swap=false;
            for(int j=0;j<a.length-1-i;j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap=true;
                }
            }
            i++;
            if(!swap)
            {
                break;
            }
        }
        for(int k=0;k<a.length;k++)
        {
            System.out.println(a[k]);
        }
    }
}
