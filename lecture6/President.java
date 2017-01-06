class President
{

    public static void main(String[] args)
    {
        System.out.println(canRunForPresident(30, true));
    }

    // PROBLEM: write a method that returns a boolean
    // which is true if you can run for president of the USA
    // HINT: The rule is must be american born and at least 35
    // Inputs: bornInTheUsa and age
    // ANSWER:
    public static boolean canRunForPresident(int age, boolean bornInTheUSA)
    {
        return (age >= 35 && bornInTheUSA);

        // ANSWER2: (logically the same, but not as nice)
        // if (age >= 35 && bornInTheUSA) 
        // {
        //     return true;
        // } 
        // else
        // {
        //     return false;
        // }
    }

    // QUESTION: write a boolean method cannotRunForPresident
    // ANSWER:
    public static boolean cannotRunForPresident(int age, boolean bornInTheUSA)
    {
        return (age < 35 || !bornInTheUSA);

        // ANSWER2
        // By demorgan's law, this is the same
        //
        // return (! (age >= 35 && bornInTheUSA) );

        // ANSWER3:
        // The best is to just reuse the previous method
        //
        // return ! canRunForPresident(age, bornInTheUSA);
    }
 
}
