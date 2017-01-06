import java.util.*;

class DoubleArrays2
{

    public static void main(String[] args) 
    {
        int[][] jagged = {
            {1, 2, 3},
            {4, 5},
            {6}
        };

        int[] lengths = rowLengths(jagged);
        System.out.println("row lengths: "
                           + Arrays.toString(lengths));

        // PROBLEM: Write a method that takes a double array
        // and returns the lengths of its rows.
    }

    // ANSWER
    public static void rowLengths(int[][] a)
    {
        for (int i = 0; i < a.length; ++i)
        {
            System.out.println(a[i].length);
        }
    }
}
