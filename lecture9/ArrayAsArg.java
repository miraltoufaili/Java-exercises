class ArrayAsArg
{

    public static void main(String[] args)
    {
        int[] a = { 4, 3, 2, 1 };
        // PROBLEM: write a method that takes
        // an int array and prints the first value
    
        printfirst(a);
    }

    public static void printfirst(int[] arr)
    {
        // just to be safe
        if (arr.length == 0 ) {
            return;
            // OR if you want to be fancy:
            // throw new IllegalArgumentException("array of length 0");
        }
        System.out.println(arr[0]);
    }
}
