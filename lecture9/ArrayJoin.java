import java.util.Arrays;

class ArrayJoin
{

    public static void main(String[] args)
    {
        // PROBLEM, write a method that takes
        // two arrays as input and returns an
        // array that has the values of both arrays
        // one after the other
        char[] arr1 = { 'c', 'x', 'b'};
        char[] arr2 = { 'd', 'a', 'z'};
        char[] joined = join(arr1, arr2);

        System.out.println(Arrays.toString(joined));
    }

    // ANSWER:
    public static char[] join(char[] first, char[] second)
    {
        char[] answer = new char[first.length + second.length];

        for (int i = 0; i < first.length; ++i)
        {
            answer[i] = first[i];
        }

        for (int i = 0; i < second.length; ++i)
        {
            answer[second.length + i] = second[i];
        }
        return answer;
    }
}
