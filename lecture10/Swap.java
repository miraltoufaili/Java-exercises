import java.util.Arrays;

class Swap
{

    public static void main(String[] args)
    {

        // PROBLEM: Create a method that
        // Swaps the entries at position i and j of an
        // array
        int[] original = { 12, 22, 3, 3, 45, 16, 7, 2, 4 };
        swap(original, 0, 4);

        System.out.println(Arrays.toString(original));
    }

    // ANSWER:
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
