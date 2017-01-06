class MethodScope2
{

    // QUESTION:
    //  What does the following print out?
    public static void main(String[] args)
    {
        int x = 10;
        doSomething();
        System.out.println("x is: " + x); // prints 10
    }

    public static void doSomething()
    {
        int x = 22;
        System.out.println("x is: " + x); // prints 22
    }
}
