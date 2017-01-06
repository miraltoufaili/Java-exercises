class ConvertDoWhile
{

    public static void main(String[] args)
    {
        int x = 1;
        // QUESTION: Dos this print out anything?
        // PROBLEM: Convert to a do while.

        // ANSWER: yes, it runs once before the
        // condition is checked.

        do
        {
            System.out.println("Woohoo!");
        } while (x < 0);

        // ANSWER2:
        
        System.out.println("Woohoo!");
        while (x < 0)
        {
            System.out.println("Woohoo!");
        }
    }
}
