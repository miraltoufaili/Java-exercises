class DiceRoll
{
    public static void main(String[] args)
    {
        int roll = 3;

        // write a condition for a dice game where rolling
        // a 5 or a 6 wins and everything else loses
        // ANSWER:
        if (roll == 5 || roll == 6)
        {
            System.out.println("You win!");
        } else {
            System.out.println("You lose! :( ");
        }
    }
}
