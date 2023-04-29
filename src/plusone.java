import java.util.Arrays;

public class plusone {
    public static void main(String[] args)
    {int[] digits = {4,3,2,9};
        plusOne(digits);
    }
    public static void plusOne(int[] digits)
{ int z=digits.length-1;
    if(digits[z]<=8)
    {
        digits[z]=digits[z]+1;
        System.out.println(digits[z]);
    }
    else if(digits[z]==9)
    {
        digits[z]=0;
        int i=z;
        digits[z-1]+=1;

    }
    for(int i=0;i<digits.length;i++)
    {
        System.out.println(digits[i]);
    }

}}

