//counting the number of occurences of a digit
public class countingoccurences {
    public static void main(String[] args)
    {
        int a=2345227;
        int count=0;
        while(a!=0)
        {
        if(a%10==2)
        {
            count++;
        }
        a=a /10;
    }
        System.out.println(count);
}}
