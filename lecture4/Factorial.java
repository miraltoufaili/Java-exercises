class Factorial
{
    // write a loop to compute 
    // 10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
    public static void main(String[] args)
    {
        // ANSWER:
        int factorial = 1;
        for (int n = 1; n <= 10; n++)
        {
            factorial *= n;
        }
        System.out.println(factorial);
    }
}
