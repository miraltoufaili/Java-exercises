class DrawOneBoxNotAsGood
{
    // Not as good. You have to understand the whole thing to
    // understand any bit of it. You need to edit mulitple
    // places to change the numbers
  
    public static void main(String[] args)
    {
        for (int x = 1; x <= 40; x++)
        {
            System.out.print("*");
        }
        System.out.println();
        for (int row = 2; row <= 10; row++)    
        {
            System.out.print("*");
            for (int column = 2; column <= 39; column++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int x = 1; x <= 40; x++)
        {
            System.out.print("*");
        }
        System.out.println();    

    }
}