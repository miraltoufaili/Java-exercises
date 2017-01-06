
class PickRandom
{

    public static void main(String[] args)
    {
        // PROBLEM: print 10 random numbers from 50 to 75 (inclusive)
        for (int i = 0; i < 10; i++) 
        {
            System.out.println( 50 + (int) (26 * Math.random()));
        }

        // OR
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(RandomUtils.randomInt(50, 75));
        }
    }

}
