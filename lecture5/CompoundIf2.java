class CompoundIf2
{
    public static void main(String[] args)
    {
        int age = 99;
    
        // Someone is in the workforce if their age satisfies
        //   16 <= age <= 65. Write an expression that
        // tests for NOT being int the workforce
        if (age < 16 || 65 < age)
        {
            System.out.println("x in NOT in workforce!");
        }
    }
}
