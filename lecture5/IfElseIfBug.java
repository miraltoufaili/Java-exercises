class IfElseIfBug
{
    // PROBLEM: what is wrong with this
    // logic?
    public static void main(String[] args)
    {
        int age = 25;
        if (age >= 16)
        {
            System.out.println("You can drive");
        }
        else if (age >= 18)
        {
            System.out.println("You can vote");
        }

        // ANSWER: these should be two separate ifs
        //
        if (age >= 16)
        {
            System.out.println("You can drive");
        }
        
        if (age >= 18)
        {
            System.out.println("You can vote");
        }   
    }
}
