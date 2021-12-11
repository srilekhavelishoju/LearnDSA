package EdyodaPractice.DSA.Assignments;

public class FindSmallestNumberUsingStack
{
    static void printSmallest(int arr[])
    {
        int first, arr_size = arr.length;
        if (arr_size < 2)
        {
            System.out.println(" Invalid Input ");
            return;
        }
        first = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++)
        {
            if (arr[i] < first)
            {
                first = arr[i];
            }

        }
        System.out.println("The smallest element is " + first );
    }

    public static void main (String[] args)
    {
        int arr[] = {12, 13, 10, 34};
        printSmallest(arr);
    }
    }
