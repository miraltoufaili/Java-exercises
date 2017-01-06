class CookieJar
{
    // Static class model of a cookie jar
    // DONT USE THIS -- Need a separate class for each
    // different cookie jar.
    // See folder cookie2-objects for how to implement with
    // objects
    private static int cookiesInJar = 5;

    public static void removeCookie()
    {
        if (cookiesInJar == 0)
        {
            System.out.println("Oreos: No more cookies");
        }
        else
        {
            cookiesInJar--;
            System.out.println("Oreos: Omnomom One delicious cookie for you!");
            System.out.println("Oreos: " + cookiesInJar + " cookies left");
        }
    }
}
