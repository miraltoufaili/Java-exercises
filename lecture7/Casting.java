class Casting
{
    public static void main(String[] args)
    {
        int x = 3;
        double y = x;
        System.out.println(y);  // OK
        
        // FIX THIS:
        double a =  3.9;
        int b = (int) a;
        // we can cast a double to an int, with the (int) cast operation
        // it trucates a
        // prints 3
        System.out.println(b);
        
        long anotherNumber = 2147483648L;
        // prints -2147483648, because 2147483648 is one over the largest int
        // so it rolls over to the smallest int.
        System.out.println((int) anotherNumber);
    }
}
