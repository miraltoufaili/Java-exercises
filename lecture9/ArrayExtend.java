import java.util.Arrays;

class ArrayExtend
{

    public static void main(String[] args)
    {
        // PROBLEM, write a method that takes
        // an array that adds one more value to it
        char[] arr1 = { 'c', 'x', 'b'};

        char[] extended = extend(arr1, 'y');
        System.out.println(Arrays.toString(extended));
    }

    // ANSWER:
    public static char[] extend(char[] a, char c)
    {
         char[] ans = new char[a.length + 1];
         for (int i = 0; i < a.length; i++)
         {
             ans[i] = a[i];
         }
         ans[a.length] = c;
         return ans;
    }
}
