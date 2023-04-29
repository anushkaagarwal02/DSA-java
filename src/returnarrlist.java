import java.util.ArrayList;
    public class returnarrlist {
        public static void main(String[] args)
        {
            int arr[]={2,3,1,4,4,5};

            System.out.println(linear(arr,4,0,new ArrayList<>()));

        }
        public static ArrayList<Integer> linear(int[] arr, int e, int b,ArrayList<Integer>list)
        {
            if(b==arr.length)
            {
                return list;
            }
            if (arr[b] == e) {
                list.add(b);
            }
            return linear(arr,e,b+1,list);
        }

    }
