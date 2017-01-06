class Easy123
{
    // Example of methods with same name, but different input types
    public static void main(String[] args)
    {
        String answer = sum("Easy as ", 12, 3);
        System.out.println(answer);
        System.out.println(sum(4, 5, 6));
    }
    
     public static String sum(String x, int y, int z)
     {
        return x + y + z;
     }   
     
     public static int sum(int x, int y, int z)
     {
        
        return x + y + z;
     }
}
