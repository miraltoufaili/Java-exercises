public class Retval3
{

    // PROBLEM:
    // Find the bug
    public static void main(String[] args)
    {
        // ANSWER: it would be nice if this program 
        // did something with the return value.
        // nothing is printed right now.
         hi();
    }

    //  ANSWER this should return a String, not an int
    public static int hi()
    {
        return "Hello There";
    }
}
