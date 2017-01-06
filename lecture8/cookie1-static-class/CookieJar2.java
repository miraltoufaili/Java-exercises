class CookieJar2
{
    // Static class model of a cookie jar
    // DONT USE THIS -- Need a separate class for each
    // different cookie jar.
    // See folder cookie2-objects for how to implement with
    // objects
    private static int cookiesInJar = 10;

    public static void removeCookie()
    {
        if (cookiesInJar == 0)
        {
            System.out.println("Choco Chip: No more cookies");
        }
        else
        {
            cookiesInJar--;
            System.out.println("Choco Chip: Omnomom One delicious cookie for you!");
            System.out.println("Choco Chip: " + cookiesInJar + " cookies left");
        }
    }
}
