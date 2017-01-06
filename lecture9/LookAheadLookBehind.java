class LookAheadLookBehind
{
    public static void main(String[] args)
    {
        int[] nums = { 2, 9, 3, 0, 7, 11};

        // to print the elements of nums
        // i goes between 0 and length -1 
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    
        // to print the changes between elements of nums
        // METHOD1: look-ahead. You look at the next value
        // i goes between 0 and length -2   (if it went to length -1, 
        // the look-ahead would go past the end of the array
        for (int i = 0; i < nums.length - 1; i++)
        {
            int change = nums[i + 1] - nums[i];
            System.out.print(change + " ");
        }
        System.out.println();
        
        // METHOD2: look-behind. You look at the next value
        // i goes between 1 and length - 1   (if it started at 0,
        // the look-behind would go before the start of the array
        for (int i = 1; i < nums.length; i++)
        {
            int change = nums[i] - nums[i - 1];
            System.out.print(change + " ");
        }
        System.out.println();
    }
}