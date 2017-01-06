class Cookies
{
    public static void main(String[] args)
    {
        printRecipe(2);
    }

    // THESE can be parametrized. See below:
    public static void printRecipe1()
    {
        System.out.println("Mix the following ingredients in a bowl:");
        System.out.println("4 cups flour");
        System.out.println("1 cup butter");
        System.out.println("1 cup sugar");
        System.out.println("2 eggs");
        System.out.println("2 bags chocolate chips");
        System.out.println("Place on sheet and Bake for about 10 minutes.");
    }


    public static void printRecipe2()
    {
        System.out.println("Mix the following ingredients in a bowl:");
        System.out.println("8 cups flour");
        System.out.println("2 cups butter");
        System.out.println("2 cups sugar");
        System.out.println("4 eggs");
        System.out.println("4 bags chocolate chips");
        System.out.println("Place on sheet and Bake for about 10 minutes.");
    }

    // better
    public static void printRecipe(int n)
    {
        System.out.println("Mix the following ingredients in a bowl:");
        System.out.println( (4 * n) + " cups flour");
        System.out.println( n + " cups butter");
        System.out.println( n + " cups sugar");
        System.out.println( (2 * n) + " eggs");
        System.out.println( (2 * n) + " bags chocolate chips");
        System.out.println("Place on sheet and Bake for about 10 minutes.");
    }

}
