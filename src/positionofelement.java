import java.util.ArrayList;
public class positionofelement {
    public static void main(String[] args)
    {
        int [] nums={1,3,3,2,2,5};
       System.out.println( position(nums,9,0,new ArrayList<>()));}
public static ArrayList<Integer>  position(int[] nums,int target,int i,ArrayList<Integer> list){
        if(i==nums.length-1 ) {
            if (list.isEmpty()) {
                list.add(-1);
                list.add(-1);
                return list;
            }
            else
            {
                return list;
            }
        }
        else
{
    if(nums[i]==target) {
    list.add(i);
}
    position(nums,target,i+1,list);
    return list;
}
}
}