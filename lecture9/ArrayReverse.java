import java.util.Arrays;

class ArrayReverse
{

    public static void main(String[] args)
    {

        // PROBLEM: Create a method that returns
        // a new array which is the reverse of the
        // original
        int[] original = { 9, 1, 7, 3 };
        int[] reversed = reverse(original);
    
        // should stay the same
        System.out.println(Arrays.toString(original));

        // should be reversed
        System.out.println(Arrays.toString(reversed));
    }

    // ANSWER:
    public static int[] reverse(int[] original) 
    {
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; ++i) 
        {
            reversed[i] = original[original.length - 1 - i];
        }
        return reversed;
    }

    // ALTERNATE SOLUTION, WITH MORE VARIABLES, LESS MATH!
    public static int[] reverse2(int[] original)
    {
        int[] reversed = new int[original.length];

        int i = 0;
        int j = original.length - 1;
        while (i < original.length) {
            reversed[j] = original[i];
            i++;
            j--;
        }
        return reversed;
    }

}
