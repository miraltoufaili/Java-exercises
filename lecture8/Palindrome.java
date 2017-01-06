import java.util.Scanner;

class Palindrome
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // PROBLEM: This palindrome code detects MADAM
        // but not, Madam I'm Adam, or A MAN A PLAN A CANAL PANAMA
        // Fix this to ignore spaces and punctuation

        System.out.print("Please type a string of characters: ");
        String s = keyboard.nextLine();
        s = s.toUpperCase();   // Make everything uppercase to simplify tests

        int left = 0;               // location of first char in the String s
        int right = s.length() - 1; // location of last  char in the String s

        boolean isPalindrome = true;
        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                isPalindrome = false;
                break;
            }
            // you know that char at position left and right are identical
            left++;
            right--;
        }

        System.out.printf("Is %s a palindrome? ", s);
        System.out.println(isPalindrome ? "YES!" : "NO!");
    }
}
