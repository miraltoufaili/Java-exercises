import java.math.BigInteger;

// BONUS EXAMPLE: Print the digits (use the BigInteger class for arbirtarily large numbers)
public class PrintDigits
{

    public static void main(String[] args)
    {
        // BigInteger is an integer class that has no
        // upper limit
        BigInteger N = new BigInteger(args[0]);

        long startTime = System.currentTimeMillis();
        printIt(N);
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.printf("\nTook %.10f seconds\n", elapsedTime / 1000.0);
    }

    // Printing digits of a number N is O(log(N)) 
    public static void printIt(BigInteger N)
    {
        final BigInteger TEN = new BigInteger("10");
        while (N.compareTo(BigInteger.ZERO) == 1)
        {
            System.out.println(N.mod(TEN));
            N = N.divide(TEN);
        }
    }
}
