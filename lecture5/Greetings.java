class Greetings
{
    public static void main(String[] args) 
    {
        helloDimitri();
        helloHenry();
        
        // merge these into one method that takes a parameter
        // ANSWER:
        hello("Dimitri");
        hello("Henry");
    }

    public static void helloDimitri()
    {
        String name = "Dimitri";
        System.out.println("Hello " + name);
    }

    public static void helloHenry()
    {
        String name = "Henry";
        System.out.println("Hello " + name);
    }
    
  
    // ANSWER:
    public static void hello(String name)
    {
         System.out.println("Hello " + name);
    }
}
