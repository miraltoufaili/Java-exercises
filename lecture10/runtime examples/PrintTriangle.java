public class PrintTriangle
{

    // timing code
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);

        long startTime = System.currentTimeMillis();
        printIt(N);
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.printf("\nTook %.4f seconds\n", elapsedTime / 1000.0);
    }

    // Prints a triangle of size N
    // This is still an O(N^2) algorithm
    // The triangle is about N^2 / 2 in size
    public static void printIt(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
