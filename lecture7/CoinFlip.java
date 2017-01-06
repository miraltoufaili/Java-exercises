
class CoinFlip
{

    public static void main(String[] args)
    {
        // PROBLEM: write a method that simulates a
        // coin flip and returns 'H' or 'T' with equal
        // probablity
        char c = coinFlip();
        System.out.println("You flipped " + c + ", I win!");
    }
    
    // ANSWER
    public static char coinFlip()
    {
        return (Math.random() > 0.5) ? 'H' : 'T';
    }
}
