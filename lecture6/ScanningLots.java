import java.util.Scanner;

class ScanningLots 
{

    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);

        // PROBLEM: Scan ten numbers from the user and print them right back
        // ANSWER
        final int COUNT = 10;

        for (int i = 1; i <= COUNT; ++i) 
        {
            System.out.println("please enter a number");
            int x = myScanner.nextInt();
            System.out.println("got it, " + x);
        }
    }
}
