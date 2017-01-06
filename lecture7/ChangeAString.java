class ChangeAString
{

    public static void main(String[] args)
    {
        // PROBLEM: Write a method that returns the
        // string with the first letter replaced with J
        String changed = changeString("Hello!!");
        System.out.println(changed);
    }
    
    // You can't directly change the incoming string
    // it is immutable, but you can make a new String
    public static String changeString(String s)
    {
        return "J" + s.substring(1);
    }
    
    // ALSO AN OK ANSWER:
    public static String changeString2(String s)
    {
        String answer = "J";
        for (int i = 1; i < s.length(); i++ )
        {
             answer = answer + s.charAt(i);
        }
        return answer;
    }
}
