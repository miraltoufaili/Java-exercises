import java.util.Scanner;

class StringBug
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter some words:");
        System.out.println("(DONE to finish)");

        // PROBLEM: What is wrong with this code
        // to keep reading and printing
        // strings until the word DONE is entered
        String word;
        do {
            word = keyboard.next();
            System.out.println("You entered " + word);
        // Wrong test == and != don't do what we want for Strings
        //  } while (word != "DONE");
        } while (!word.equals("DONE"));

        System.out.println("Goodbye!");
    }
}
