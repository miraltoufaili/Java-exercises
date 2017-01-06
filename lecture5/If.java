class If 
{
    public static void main(String[] args)
    {
        int age = 5;
        // write a condition to test for
        // being old enough to vote
        // ANSWER
        if (age >= 18) 
        {
            System.out.println("You can vote!");
        } 
        else
        {
             System.out.println("You cannot vote!");
             System.out.println("You can vote in " + (18 -age) + " years" );
        }
    }
}
