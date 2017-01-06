import java.util.*;

class BinarySearch
{

    // You should understand how this works!
    public static int search(int[] a, int value)
    {
        int low = 0;
        int high = a.length - 1;
        do {
            int middle = (low + high) / 2;
            if (value == a[middle]) {
                return middle;        // value found!
            }

            if (value > a[middle]) {
                low = middle + 1;     // look in the right half
            } else {
                high = middle - 1;    // look in the left half
            }
        } while (low <= high);

        return -1;
    }

    public static void main(String[] args) 
    {
        int[] a = { 1, 3, 4, 9, 11, 99, -1, 0};
        // Must sort array to do binary search
        BubbleSort.sort(a);   // there is also a built-in Arrays.sort() in java
        System.out.println(Arrays.toString(a));
        System.out.println(search(a, 9));
        System.out.println(search(a, 12));
    }
}
