class S1ArrayUtils
{
    public static int randomInt(int a, int b)
    {
        return a + (int) ((b - a + 1) * Math.random());
    }

    // Swap the elements i and j in array a
    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Randomly scramble an array
    public static void shuffle(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            int randomSpot = randomInt(0, a.length - 1);
            swap(a, i, randomSpot);
        }
    }

    // returns an array with the numbers 0...(n -1)
    // in random order
    public static int[] randomArray(int n)
    {
        int[] answer = sortedArray(n);
        shuffle(answer);
        return answer;
    }

    // returns an array with the numbers 0...(n -1)
    // in ascending order
    public static int[] sortedArray(int n)
    {
        int[] answer = new int[n];
        for (int i = 0; i < n; ++i)
        {
            answer[i] = i;
        }
        return answer;
    }
}
