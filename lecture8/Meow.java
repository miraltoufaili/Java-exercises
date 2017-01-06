class Meow
{
    // Uses method and variable in CatUtilities.java
    public static void main(String[] args)
    {
        CatUtilities.sayMeow();
        CatUtilities.sayMeow();
        // Can't use MAX_NUMBER_OF_LIVES -- this is a private variable
        // System.out.println("Cats have "
        //                   + CatUtilities.MAX_NUMBER_OF_LIVES
        //                   + " lives");
    }

}
