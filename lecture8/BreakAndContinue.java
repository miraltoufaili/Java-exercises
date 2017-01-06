class BreakAndContinue
{

    public static void main(String[] args)
    {
        // PROBLEM: What do these two loops do?

        System.out.println("Loop with break");

        for (int i = 1; i <= 5; ++i)
        {
            if (i == 3)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Done loop 1");    
        // Prints, 1, 2 and then Done loop 1        

        System.out.println();
        System.out.println("Loop with continue");

        for (int i = 1; i <= 5; ++i)
        {
            if (i == 3)
            {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Done loop 2");        
        // Prints, 1, 2, 4, 5 and then Done loop 2        

    }
}
