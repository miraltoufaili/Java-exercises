import java.util.*;

class LinearSearch
{

    // PROBLEM: Write a linear search method
    // that scans through an array and returns
    // where the given value can be found
    // or -1 if not found
    public static int search(int[] a, int value)
    {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] a = { 1, 3, 4, 9, 11, 99, -61, 0};
        System.out.println(Arrays.toString(a));
        System.out.println(search(a, 9));
        System.out.println(search(a, 12));
    }
}
