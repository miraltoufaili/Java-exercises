import java.util.Scanner;

class SumOfLots
{

    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);

        // PROBLEM: Modify this code to scan 10 numbers
        // from the user and report the sum back.
        // ANSWER:
        final int COUNT = 10;
        int sum = 0;

        for (int i = 1; i <= COUNT; ++i)
        {
            System.out.println("please enter a number");
            int next = myScanner.nextInt();
            sum += next;
        }

        System.out.println("The sum is " + sum);
    }
}
