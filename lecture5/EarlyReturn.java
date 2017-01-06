class EarlyReturn
{
    public static void main(String[] args)
    {
        printStuff("MMMM", 5);
    }

    /**
     * Prints n copies of the String s
     * PROBLEM: fix this to return early
     * and warn if n is negative
     */
    public static void printStuff(String s, int n)
    {
        for (int i = 0; i < n; ++i)
        {
            System.out.println(s);
        }
    }
    
    // ANSWER:
    public static void printStuff2(String s, int n)
    {
        if (n < 0)
        {
            System.out.println("You can't print negative times: " + n);
            return;
        }

        for (int i = 0; i < n; ++i)
        {
            System.out.println(s);
        }
    }
}
