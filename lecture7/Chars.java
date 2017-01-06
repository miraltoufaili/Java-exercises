class Chars
{
    public static void main(String[] args)
    {
        // All ways to increment a character
        char myChar = 'A';
        myChar++;
        System.out.println(myChar);     // prints B
        myChar += 1;
        System.out.println(myChar);     // prints C
        myChar = (char) (myChar + 1);   // prints D
        System.out.println(myChar);
        
        // Prints false
        System.out.println('a' > 'b');
    }
}
