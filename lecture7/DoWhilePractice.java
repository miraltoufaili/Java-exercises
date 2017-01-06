import java.util.Scanner;

class DoWhilePractice
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int number;

        // PROBLEM: Make this less repetitive with a do-while statement
        // System.out.println("Please enter a number greater than 10");
        // number = keyboard.nextInt();
        // while (number <= 10)
        // {
        //     System.out.println("Please enter a number greater than 10");
        //     number = keyboard.nextInt();
        // }

        // ANSWER:
        do
        {
            System.out.println("Please enter a number greater than 10");
            number = keyboard.nextInt();
        } while (number <= 10);

        System.out.println("Good job: " + number);
    }
}
