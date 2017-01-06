import java.util.*;

public class PrintTimesTable
{

    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);

        long startTime = System.currentTimeMillis();
        printIt(N);
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.printf("Took %.4f seconds\n", elapsedTime / 1000.0);
    }

    // Printing a times table is O(N*N) for a given size N
    public static void printIt(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++ )
            {
                System.out.printf("%d times %d is %d\n", i, j, i * j);
            }
        }
    }
}
