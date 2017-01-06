class ManyFlips
{

    public static void main(String[] args)
    {
        // PROBLEM: Write a program that flips a coin until
        // you get N heads in a row.
        int totalFlips = flipUntilNHeadsInARow(20);
        System.out.println("Done! It took " + totalFlips);
    }

    /** Flips a coin until n heads in a row are reached
     *  Returns the number of flips it took
     */
    public static int flipUntilNHeadsInARow(int streakGoal)
    {
        int numHeadsInARow = 0;
        int totalFlips = 0;

        char flip;
        do 
        {
            flip = coinFlip();
            System.out.print(flip);
            totalFlips++;
            if (flip == 'H') {
                numHeadsInARow++;
            } else {
                numHeadsInARow = 0;
            }
        } while (numHeadsInARow < streakGoal);
        
        System.out.println();
        return totalFlips;
    }

    /** Simulates a coin flip
     *  Returns H or T with equal probability.
     */
    public static char coinFlip()
    {
        return (Math.random() < 0.5) ? 'H' : 'T';
    }
}
