class Beer
{
    // Problem: wrap this in a for loop
    // so that the program sings all the verses
    // of the song
    // ANSWER:
    public static void main(String[] args)  
    {
        for (int i = 99; i >= 1; i--) 
        {
            System.out.println(i + " bottles of beer on the wall.");
            System.out.println(i + " bottles of beer!");
            System.out.println("If one of those bottles should happen to fall, ");
            System.out.println("There'd be " + (i - 1) + "bottles of beer on the wall!\n");
        }
    }
}
