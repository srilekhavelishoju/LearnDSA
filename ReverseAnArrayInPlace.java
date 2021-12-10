package EdyodaPractice.DSA.Assignments;

import java.util.Arrays;

public class ReverseAnArrayInPlace
{
    public static void main(String[] args)
    {
        int[] numbers={1,2,3,4,5};
        reverse(numbers);
    }
    public static void reverse(int[] input)
    {
        System.out.println("Original Array:"+ Arrays.toString(input));
        if(input==null||input.length<=1)
        {
            return;
        }
        for(int i=0;i<input.length/2;i++)
        {
            int temp=input[i];
            input[i]=input[input.length-1-i];
            input[input.length-1-i]=temp;
        }
        System.out.println("Reversed Array"+Arrays.toString(input));
    }

}
