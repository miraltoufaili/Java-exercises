import java.util.Arrays;

class ArrayReverseInPlace
{

    public static void main(String[] args)
    {

        // PROBLEM: Create a method that changes the original
        // array to be reversed
        int[] original = { 9, 1, 7, 3 };

        reverseInPlace(original);

        // should be reversed
        System.out.println(Arrays.toString(original));
    }

    // ANSWER:
    public static void reverseInPlace(int[] arr)
    {
        for (int i = 0; i < arr.length / 2; ++i)
        {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 -i ] = arr[i];
            arr[i] = temp;
        }
    }
}
