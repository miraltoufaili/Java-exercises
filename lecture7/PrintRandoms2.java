class PrintRandoms2
{

    public static void main(String[] args)
    {
        // PROBLEM:
        // Print random numbers until you get one >= 0.9
        // How many times does it run?

        double number;

        // ANSWER: The number of times it runs changes
        //         because of randomness
        do
        {
            number = Math.random();
            System.out.println(number);
        }  while ( number < 0.9);
    }
}
