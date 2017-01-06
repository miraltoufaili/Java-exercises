
class TwoDice
{

    public static void main(String[] args)
    {
        // PROBLEM: Write a program that rolls two dice until
        // they match, using RandomUtils.randomInt()

        // ANSWER:
        int roll1;
        int roll2;
        do {
            roll1 = RandomUtils.randomInt(1, 6);
            roll2 = RandomUtils.randomInt(1, 6);
            System.out.printf("Rolled a %d and a %d\n", roll1, roll2);
        } while (roll1 != roll2 );
    }
}
