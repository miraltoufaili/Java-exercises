class Donuts
{

    public static void main(String[] args)
    {
       eatDonuts(0);
    }

    // Problem: print a error message and return
    // early if there are no donuts to eat
    public static void eatDonuts(int numDonuts)
    {
        // ANSWER:
        if (numDonuts <= 0) 
        {
            System.out.println("No Donuts"); 
            return;
        }
        System.out.println("Omnom");
        return;
    }
}