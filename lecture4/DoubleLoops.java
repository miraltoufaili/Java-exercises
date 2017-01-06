class DoubleLoops
{

   public static void main(String[] args) 
   {
        // Problem: The following loop prints four stars
        // Use this to print a 3 x 4 box of stars
        // for (int j = 0; j < 4; j++) 
        // {
        //     System.out.print("* ");
        // }
        // System.out.println();
        
        // ANSWER
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
