import java.util.Arrays;

class ArrayReverseInPlace
{

    public static void main(String[] args)
    {

        // PROBLEM: Create a method that changes the original
        // array to be reversed, using Swap
        int[] original = { 9, 1, 7, 3 };

        reverseInPlace(original);

        // should be reversed
        System.out.println(Arrays.toString(original));
    }

    // ANSWER
    public static void reverseInPlace(int[] arr)
    {
        // Only have to go halfway
        for (int i = 0; i < arr.length / 2; ++i)
        {
            int last = arr.length - 1;
            S1ArrayUtils.swap(arr, i, last - i);
        }
    }
}
