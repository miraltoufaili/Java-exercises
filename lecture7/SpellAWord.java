class SpellAWord
{

    public static void main(String[] args)
    {
        // PROBLEM: Write a method that spells a given word
        spellWord("Chocolate");
    }
    
    // ANSWER:
    public static void spellWord(String s)
    {
        for (int i = 0; i < s.length(); i++ )
        {
            System.out.println(s.charAt(i));
        }
    }
}
