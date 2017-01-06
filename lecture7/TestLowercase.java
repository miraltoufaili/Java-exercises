class TestLowercase
{

    public static void main(String[] args)
    {
        char myChar = 'x';

        // PROBLEM: Write a boolean condition that is
        // true if myChar is a lowercase (roman) character

        boolean lower = ('a' <= myChar && myChar <= 'z');
        System.out.println("Character " + myChar + " lowercase? " + lower);
    }
}
