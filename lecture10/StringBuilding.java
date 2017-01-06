class StringBuilding
{

    // StringBuilder lets you build up strings and change
    // all parts of them before freezing them into immutable
    // Strings
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Hello");
        sb.setCharAt(0, 'J');
        changer(sb);
        String message = sb.toString();
        System.out.println(message);  
        // QUESTION: What does this print?
        // ANSWER: Jello!
    }

    public static void changer(StringBuilder sb)
    {
        sb.append("!");
    }
}
