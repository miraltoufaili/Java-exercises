class GivingBack
{


    public static void main(String[] args)
    {
        int x = gimmeFive();
        int y = gimmeFive();
        // prints 25
        System.out.println(x * y);

        String s = weatherReport();
        // ANSWER: prints 
        // Winter is coming
        System.out.println("Today's forecast: " + s);

        // PROBLEM
        // what does this do?
        // ANSWER: prints 5
        int z = 2 * gimmeFive() + (1 - 30/gimmeFive());
        System.out.println(z);
    }

    public static int gimmeFive()
    {
        return 5;
    }

    public static String weatherReport()
    {
        return "Winter is coming";
    }
}
