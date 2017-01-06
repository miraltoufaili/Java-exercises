import java.util.Arrays;

class DoubleArray
{

    public static void main(String[] args)
    {

        // PROBLEM: Create a method that returns
        // a new array which is the double of the
        // original
        int[] original = { 9, 1, 7, 3 };

        int[] doubled = timesTwo(original);

        // should stay the same
        System.out.println(Arrays.toString(original));

        // should be doubled
        System.out.println(Arrays.toString(doubled));
    }

    // ANSWER:
    public static int[] timesTwo(int[] original) 
    {
        int[] answer = new int[original.length];
        for (int i = 0; i < original.length; ++i) 
        {
            answer[i] = 2 * original[i];
        }
        return answer;
    }


}
