class PrintArray
{

    // Timing code 
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int[] test = S1ArrayUtils.randomArray(N);

        long startTime = System.currentTimeMillis();
        printIt(test);
        long elapsedTime = System.currentTimeMillis() - startTime;
    
        System.out.printf("Took %.10f seconds\n", elapsedTime / 1000.0);
    }

    // Printing an array is O(N) in the length of the array
    public static void printIt(int[] test) 
    {
        for (int i = 0; i < test.length; i++) 
        {
            System.out.print(test[i] + " ");
        }
        System.out.println();
    }
}
