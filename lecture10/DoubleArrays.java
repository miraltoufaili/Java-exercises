import java.util.*;

class DoubleArrays
{

    public static void main(String[] args)
    {
        // QUESTION: What do these print out?
        int[][] a = {
            { 1, 2, 3},
            { 3, 4, 5}
        };
        
        System.out.println(a[1][2]);       // 5
        int[] firstRow = a[0];        
        System.out.println(Arrays.toString(firstRow));  // [ 1, 2, 3 ]
        System.out.println(Arrays.deepToString(a));     // [ [ 1, 2, 3 ], [3, 4, 5] ]

        System.out.println(a.length);     // 2  (num rows)
        System.out.println(a[0].length);  // 3  (num columns)
        System.out.println(Arrays.toString(a[0]));  // [ 1, 2, 3 ]
        System.out.println(Arrays.toString(a));     // Something like [[I@6d6e1eff, [I@58b52f79]

        // PROBLEM: None of the above print the whole
        // double array. How can you do that?
        // ANS:
        int[][] b = new int[4][2]; // zero double array 4x2
        System.out.println(Arrays.deepToString(b));
        // [[0, 0], [0, 0], [0, 0], [0, 0]]
    }
}
