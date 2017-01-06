class BadElse
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
        
        // ANS: is messing up the else
        // there should be nothing in between it and the
        // if
        System.out.println("About to break the bad news");
        
        else
        {
             System.out.println("About to break the bad news");

            System.out.println("You can't drive");
        }
    }
}
