class Countries 
{

    public static void main(String[] args) 
    {
        //PROBLEM: What will the following print? 
        String[] countries = { "Canada", "USA", "Mexico" };
        for (int i = 0; i < countries.length; ++i) 
        {
         System.out.println(countries[i]);
        }
        // ANSWER:
        // Canada
        // USA
        // Mexico
        
        for (int i = 0; i < countries.length; ++i) 
        {
         System.out.println(countries[i]);
        }
        // ANSWER
        // 6
        // 3
        // 6
    }

}
