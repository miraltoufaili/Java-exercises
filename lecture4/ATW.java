class ATW
{
    // Problem: reproduce the lyrics to around the world,
    // using loops, and including the spaces every four lines
    // as shown here:
    // http://www.azlyrics.com/lyrics/daftpunk/aroundtheworld.html
    public static void main(String[] args)
    {
        // Solution 1
        for (int i = 1; i <= 18; i++) 
        {
            for (int j = 1; j <= 4; j++)
            {
                System.out.println("Around the world, around the world");
            }
            System.out.println();
        }
        
        // Solution 2
        for (int i = 1; i <= 72; i++) 
        {
            System.out.println("Around the world, around the world");            
            if (i % 4 == 0) // we'll see ifs shortly
            {
                System.out.println();
            }
        }
    }
}