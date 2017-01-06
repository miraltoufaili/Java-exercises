class Overflow
{
    public static void main(String[] args)
    {
        int x = 2147483647;
        System.out.println(x);      // prints 2147483647
        System.out.println(x + 1);  // -2147483648
    }
}
