import java.util.Arrays;

// Use this to test how long your sorts take
// Generates a random array and then times how long
// it takes to sort it.
// Edit the sort class to test a different sort!
class SortTest
{

    public static void main(String[] args)
    {
        int size = Integer.parseInt(args[0]);

        int[] numbers = S1ArrayUtils.randomArray(size);
        // System.out.println("Before: " + Arrays.toString(numbers));

        long startTime = System.currentTimeMillis();
        // Edit this to change the sort
        QuickSort.sort(numbers);
        long elapsedTime = System.currentTimeMillis() - startTime;

        // System.out.println("After:  " + Arrays.toString(numbers));
        System.out.println();
        System.out.printf("Took %.4f seconds", elapsedTime / 1000.0);
        System.out.println();
    }

}
