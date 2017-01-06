import java.util.Arrays;

class BubbleSort
{
    // You should understand how this works!
    public static void sort(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    S1ArrayUtils.swap(a, j, j + 1);   
                }
            }
            
            // Uncomment this to print out the results of each pass
            // System.out.println(Arrays.toString(a)); 
        }
    }
    
    // test out the sort
    public static void main(String[] args)
    {
        int[] a = {2, 1, 9, 7, 6, 4, 8, 3, 5 };
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
