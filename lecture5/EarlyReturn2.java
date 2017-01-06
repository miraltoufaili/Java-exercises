class EarlyReturn2 
{
    public static void main(String[] args) 
    {
        printSign(3);
    }

    /**
     * Change this to use early return instead of if/else/if
     */
    public static void printSign(int x) 
    {
        System.out.print("x is ");
        if (x < 0) 
        {
            System.out.println("negative");
        } 
        else if (x > 0) 
        {
            System.out.println("positive");
        } 
        else 
        {
            System.out.println("zero");
        }  
    }
    
    // ANSWER
    public static void printSign2(int x) 
    {
        System.out.print("x is ");
        if (x < 0) 
        {
            System.out.println("negative");
            return;
        }
        
        if (x > 0) 
        {
            System.out.println("positive");
            return;
        } 
        
        System.out.println("zero");
    }
}
