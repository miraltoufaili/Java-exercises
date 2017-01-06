import java.util.Scanner;

class InputValidation
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int x;

        System.out.println("Please enter a number greater than 10");
        x = keyboard.nextInt();

        // PROBLEM: keep prompting the user as long as they
        // enter a number less than or equal to 10
        // ANSWER
        while (x <= 10)
        {
            System.out.println("Please enter a number greater than 10");
            x = keyboard.nextInt(); 
        }
        System.out.println("Good job! " + x);
    }
}
