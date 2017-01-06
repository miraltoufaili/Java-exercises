class IfElseIfBug2
{
    // PROBLEM: what is wrong with this
    // logic?
    public static void main(String[] args)
    {
        int age = 10;
        if (age >= 16)
        {
            System.out.println("You can drive");
        }
        
        // ANSWER, you can't have this between the if and the else
        System.out.println("About to break the bad news");
        
        else
        {
            System.out.println("You can't drive");
        }
        

    }
}
