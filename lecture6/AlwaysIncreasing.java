import java.util.Scanner;

class AlwaysIncreasing
{

    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        ///PROBLEM: Modify the previous code to scan 10 numbers
        // from the user and report whether the sequence ever decreased
        // ANSWER:
        // this is a boolean accumulation
        final int COUNT = 4;

        System.out.println("please enter a number");
        int previous = myScanner.nextInt();
        boolean alwaysIncreasing = true;
        
        for (int i = 2; i <= COUNT; ++i)
        {
            System.out.println("please enter a number");
            int x = myScanner.nextInt();

            // Instead of if could also do: 
            // alwaysIncreasing = alwaysIncreasing && (x >= previous);
            // or even
            // alwaysIncreasing &&= (x >= previous);
            if (x < previous) {
                alwaysIncreasing = false;
            } 

            previous = x; // need to update x
        }
        System.out.println("Did you sequence always increase? Answer: " + alwaysIncreasing);
        
    }
}
