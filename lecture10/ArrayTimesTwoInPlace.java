import java.util.Arrays;

class ArrayTimesTwoInplace
{

    public static void main(String[] args)
    {

        // PROBLEM: Create a method that changes the original
        // array to be reversed
        int[] original = { 9, 1, 7, 3 };
        timesTwoInPlace(original);
        System.out.println(Arrays.toString(original));
    }
    
    public static void timesTwoInPlace(int[] original) 
    {
        for (int i = 0; i < original.length; i++)
        {
             original[i] = original[i] * 2;
        }
    }
}
