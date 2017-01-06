public class Retval4 {

    // PROBLEM:
    // What does this print out?
    public static void main(String[] args)
    {
        int n = 3;
        int y = squareNumber(n);
        System.out.println(n);
        // ANS: this prints 3.
        // the method doesn't change the variable
        // in this scope
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
        return n * n;
    }
}
