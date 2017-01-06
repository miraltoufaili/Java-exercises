/**
 *  Illustrates the dangers of testing for equality of
 *  floating-point values
 *
 *  @author   Dr. Henry H. Leitner
 *  @version  Last_modified July 9, 2015 - Dimitri Kountourogianni
 */
class EqReal
{
    public static void main(String[] args)
    {
        // PROBLEM:
        // What does this do?? FIX any bugs
        // ANSWER. Goes forever because of rounding error
        // Use x <= 1.0
        double x;
        for (x = 0.0; x != 1.0; x += 0.1)
        {
            System.out.println(x);
        }
        System.out.println("Final value of x is " + x);
    }
}
