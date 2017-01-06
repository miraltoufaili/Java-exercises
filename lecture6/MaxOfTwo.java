class MaxOfTwo
{
    public static void main(String[] args)
    {
        int ans = max(3, 24);
        System.out.println("The max is " + ans);
    }
    
    public static int max(int x, int y)
    {
        if (x > y) {
            return x;
        } else {
            return y
        }
        
        // or 
        // return ( x > y ? x : y)
    }
}