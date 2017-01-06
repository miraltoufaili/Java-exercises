import java.util.Arrays;

class ArrayTimesTwo
{

    public static void main(String[] args)
    {

        // PROBLEM: Create a method that returns
        // a new array which is the double of the
        // original
        int[] original = { 9, 1, 7, 3 };

        int[] twice = timesTwo(original);

        // should stay the same
        System.out.println(Arrays.toString(original));

        // should be multiplied by two
        System.out.println(Arrays.toString(twice));
    }

    // ANSWER:
    public static int[] timesTwo(int[] original) 
    {
        int[] answer = new int[original.length];
        for (int i = 0; i < original.length; i++)
        {
            answer[i] = original[i] * 2;
        }
        return answer;
    }


}
