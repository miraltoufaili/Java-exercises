class DrawOneBoxWithLoops
{
    public static final int  ROWS    = 10;
    public static final int  COLUMNS = 40;
    public static final char PIXEL   = '*';
    public static final char INTERIOR_PIXEL = ' ';
     
    // Use methods, loops and the class constants above
    // to draw a hollow rectangle of size ROWS x COLUMNS
    // *******
    // *     *
    // *     *
    // *******
    public static void main(String[] args)
    {
        horizontalLine();
        sides();
        horizontalLine();
    }
  
    public static void horizontalLine()
    {
        for (int x = 1; x <= COLUMNS; x++)
        {
            System.out.print(PIXEL);
        }
        System.out.println();
    }

    public static void sides()
    {
        for (int row = 2; row <= ROWS - 1; row++)    
        {
            oneRowOfSides();
        }
    }
    
    public static void oneRowOfSides()
    {
        System.out.print(PIXEL);
        for (int column = 1; column <= COLUMNS - 2; column++)
        {
            System.out.print(INTERIOR_PIXEL);
        }
        System.out.print(PIXEL);
        System.out.println();
    }
}