import java.util.*;

class ShuffleArray
{

    public static void main(String[] args)
    {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // PROBLEM: Create a method that shuffles an array
        // randomly
        shuffle(a);
        System.out.println(Arrays.toString(a));

        shuffle(a);
        System.out.println(Arrays.toString(a));

    }

    // ANSWER:
    // We will also save this in S1Utils for later use!
    public static void shuffle(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            int randomSpot = S1Utils.randomInt(0, a.length - 1);
            S1ArrayUtils.swap(a, i, randomSpot);
        }
    }
}
