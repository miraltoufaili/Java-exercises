class Strings
{

    public static void main(String[] args)
    {
        // Some string manipulations
        String name = "Hello World!";
        char c = name.charAt(6);
        System.out.println(c); // prints W

        String s = name.substring(6);
        System.out.println(s); // prints World!
        
        String t = name.substring(0, 5);
        System.out.println(t); // prints Hello
        
        System.out.println("Apple".length()); // prints 5

        System.out.println("Apple".substring(1).toUpperCase());
        // prints PPLE
        
        System.out.println("Apple".substring(1).toUpperCase().length());
        // prints 4
        
        // Prints the last char: !
        System.out.println(name.charAt(name.length() - 1));
    }
}
