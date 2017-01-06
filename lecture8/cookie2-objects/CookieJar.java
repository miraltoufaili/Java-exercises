class CookieJar
{
    // THIS CLASS IS NOW A TEMPLATE FOR AN OBJECT! All we did is remove the static keyword

    private int cookiesInJar = 3;

    public void removeCookie()
    {
        if (cookiesInJar == 0)
        {
            System.out.println("CookieJar: No more cookies");
        }
        else
        {
            cookiesInJar--;
            System.out.println("CookieJar: Omnomom One delicious cookie for you!");
            System.out.println("CookieJar: " + cookiesInJar + " cookies left");
        }
    }
}
