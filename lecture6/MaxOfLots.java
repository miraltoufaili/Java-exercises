import java.util.Scanner;

class MaxOfLots
{

    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        // PROBLEM: modify the previous code to compute the max value of 10
        // integers
        // ANSWER:
        final int COUNT = 10;

        System.out.println("please enter a number");
        int max = myScanner.nextInt();   // The first is always largest so far

        for (int i = 1; i <= COUNT; ++i)
        {
            System.out.println("please enter a number");
            int x = myScanner.nextInt();
            if (x > max)
            {
                max = x;
            }
        }
        System.out.println("The max is: " + max);

    }
}
