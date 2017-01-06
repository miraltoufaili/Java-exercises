class InsertionSort
{

    // EXTRA, for fun
    public static void sort(int[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            // keep everything up to position i sorted
            for (int j = i; j > 0; j--)
            {
                if (a[j - 1] > a[j]) 
                {
                    S1ArrayUtils.swap(a, j - 1, j);
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
