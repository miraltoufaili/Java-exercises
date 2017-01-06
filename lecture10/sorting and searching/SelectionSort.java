import java.util.*;

// BONUS:
// Selection sort is similar to bubble sort,
// except we find the max first, and then swap
// once at the end
class SelectionSort
{

    public static void sort(int[] a) 
    {
        for (int i = a.length - 1; i >= 0; i--) 
        {
            int max = a[i];
            int maxIndex = i;
        
            for (int j = 0; j < i; j++) 
            {
                if (a[j] > max) {
                    max = a[j];
                    maxIndex = j;
                }
            }
            S1ArrayUtils.swap(a, i, maxIndex);
            System.out.println("Step " + i + ": " + Arrays.toString(a));
        }
    }

}
