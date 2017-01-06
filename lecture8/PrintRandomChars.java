public class PrintRandomChars
{

    public static void main(String[] args)
    {
        // PROBLEM:
        // Prints random letters from 'a' to 'z'
        int i = 1;
        while (i < 5000)
        {
            char c = (char) RandomUtils.randomInt('a', 'z');
            System.out.print("  " + c);
            i++;
        }
        System.out.println();
    }
}
