import java.util.Scanner;

class Palindrome2
{
    // this code ignores non-letters
    // when checking for palindromes
    // A MAN A PLAN A CANAL PANAMA
    // counts as a palindrome
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please type a string of characters: ");
        String s = keyboard.nextLine();
        s = s.toUpperCase(); // Make everything uppercase to simplify tests

        int left = 0;               // location of first char in the String s
        int right = s.length() - 1; // location of last  char in the String s

        boolean isPalindrome = true;
        while (left < right)
        {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (leftChar < 'A' || leftChar > 'Z')
            { // not uppercase letter
                left++;
                continue;
            }

            // If I get here, I know that leftChar is an uppercase letter
            if (rightChar < 'A' || rightChar > 'Z')
            {
                right--;
                continue;
            }

            // If I get here, I know that rightChar is an uppercase letter
            // They need to match if this is a palindrome
            if (leftChar != rightChar)
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
