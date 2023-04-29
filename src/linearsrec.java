import java.util.ArrayList;

public class linearsrec {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,3};

        System.out.println(linear(arr,4,0));
        find(arr,3,0);
        System.out.println(list);
    }
    public static int linear(int[] arr, int e, int b)
    {
        if(b==arr.length-1)
        {
            return 0;
        }
        if (arr[b] == e) {
            return b;
        }
        return linear(arr,e,b+1);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    public static void find(int[] arr,int e,int b)
    {
        if(b==arr.length)
        {
         return;
        }
        if (arr[b] == e) {
            list.add(b);

        }
        find(arr,e,b+1);
    }
    }


