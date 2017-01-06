import java.util.*;

/**
 * (Advanced only)
 * You need to know recursion to understand this one
 * 
 * One of the fastest sorting alorithms out there
 * Quicksort based on Sedgewick code.
 *
 * See:
 * http://algs4.cs.princeton.edu/23quicksort/
 * http://introcs.cs.princeton.edu/java/42sort/QuickSort.java
 */
class QuickSort
{

    public static void sort(int[] a)
    {
        sort(a, 0, a.length - 1);
    }

    // Reorder the array region between left and right,
    // inclusive, into a low and high region:
    //
    // Pick a pivot value
    // reorder the array so that everything less than the pivot value
    // appears before it in the array
    // and everything greater than the pivot value appears after it
    // in the array
    public static int partition(int[] a, int left, int right)
    {
        int pivot = a[left];
        int pivotIndex = left;  // just pick the first thing as the pivot

        int i = left;
        int j = right + 1;
        while (true)
        {
            // ++i means increment i first, before checking the array at index i
            while (a[++i] < pivot)
            {
                if (i == right)
                {
                    break;   // special case: everthing else is less than the pivot
                }
            }

            // --i means decrement i first, before checking the array at index i
            while (a[--j] > pivot)
            {
                if (j == left)
                {
                    break;    // special case: everthing else is greater than the pivot
                }
            }
            
            if (j <= i)
            {
                break;    // we've finished all swapping
            }
            
            S1ArrayUtils.swap(a, i, j);   // the value at i is a high value on
                                          // the left side of the array
                                          // the value at j is a low value in the
                                          // right side of the array, so swap them
        }
        S1ArrayUtils.swap(a, j, pivotIndex);   // put the pivot in the middle
                                               // we had it off to the side
        return j; // newPivotIndex
    }

    public static void sort(int[] a, int left, int right)
    {
        if (right <= left)                 // base case of the recursion
        {    
            return;
        }

        int pivotIndex = partition(a, left, right);
        sort(a, left, pivotIndex - 1);     // recursive calls to sort!
        sort(a, pivotIndex + 1, right);
    }
}
