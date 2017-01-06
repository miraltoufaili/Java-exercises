public class Retval2
{
    
    // PROBLEM:
    // find the bug(s)
    public static void main(String[] args)
    {
        // ANSWER: should be squareNumber(3)
        int x = squareNumber();
        System.out.println(x);
    }

    /**
     * Computes the square of a number
     *
     * @param n  the number
     *
     * @return   its square
     */
    public static int squareNumber(int n)
    {
        // ANSWER: should be 
        // return n * n;
        n * n;
    }
}
