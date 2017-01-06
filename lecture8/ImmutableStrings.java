class ImmutableStrings
{

    public static void main(String[] args)
    {
        // PROBLEM: replace the first letter
        // of this string with J
        // What is wrong with this attempted solution?
        String s = "Hello";

        // s.charAt(0) = 'J';
        // ANSWER: Won't work, you can't directly change a String,
        // you have to create a new String with the new values
        
        s = s.replace("H", "J");
    }
}
