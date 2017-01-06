class ChangeAString
{

    public static void main(String[] args)
    {
        // PROBLEM: Write a method that takes a
        // string and returns the string with all
        // letters h removed
        String changed = changeString("Hello how are you?");
        System.out.println(changed);
    }

    /** Returns a String with all letters h removed */
    // ANSWER
    public static String changeString(String s)
    {
        String answer = "";
        for (int i = 0; i < s.length(); i++)
        {
            char next = s.charAt(i);
            if (next != 'h' && next != 'H')
            {
                answer += s.charAt(i);
            }
        }
        return answer;
    }
}
