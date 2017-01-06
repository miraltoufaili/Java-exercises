class Sum
{
    // Problem:
    // Write a program to compute the sum of the first
    // 100 numbers, what about average?
    // ANSWER:
    public static void main(String[] args)
    {
        int sum = 0;
        int max = 100;
        for (int x = 1; x <= max; x++ )
        {
            sum = sum + x;
        }
        System.out.println("The sum is " + sum);
        
        double average = sum;
        average /= max;
        System.out.println("The average is " + average);
    }
}