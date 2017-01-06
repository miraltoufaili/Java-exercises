public class Retval
{
    
    // PROBLEM:
    // Fnd the bug:
    public static void main(String[] args)
    {
        int x = squareNumber(2);
        System.out.println(x);
    }

    /**
     * Computes the square of a number
     *
     * @param n  the number
     *
     * @return   its square
     */
     // ANSWER: this should have return type int
     // public static int squareNumber(int n)
    public static void squareNumber(int n)
    {
        return n * n;
    }
}
