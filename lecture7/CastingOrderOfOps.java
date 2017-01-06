
class CastingOrderOfOps
{
    public static void main(String[] args)
    {
        // PROBLEM: What do these print?
        // Prints 7.5 - the cast only applies to the 3 here
        System.out.println((int) 3 * 2.5);

        // Prints 7
        System.out.println((int) (3 * 2.5));
    }

}
