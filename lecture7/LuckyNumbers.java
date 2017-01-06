import java.util.Scanner;

class LuckyNumbers
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please guess a winning number");

        int guess = keyboard.nextInt();
        // PROBLEM: keep prompting the user until they guess
        // 1 or 13
        // ANSWER:
        // NOT guess !=1 || guess != 13
        while (guess != 1 && guess != 13)
        {
            System.out.println("try again!");
            guess = keyboard.nextInt();
        }
        System.out.println("You WIN!");
    }
}
