class MethodScope
{

    // QUESTION:
    //  What does the following print out?
    // ANS: error. x is not in scope in the method woof
    public static void main(String[] args)
    {
        int x = 10;
        woof();
    }

    public static void woof()
    {
        // int x = 55;  <-- this would be ok, the two x variables can exist
        // simultaneosly in different scopes
        System.out.println("Woof. x is: " + x);
    }
}
