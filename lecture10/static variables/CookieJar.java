class CookieJar
{
    // BUG! if this variable is static, then all the cookie jars 
    // will share the same variable instead of having their own
    private static int cookiesInJar;

    private String name;

    public CookieJar(int c, String n)
    {
        cookiesInJar = c;
        name = n;
    }

    public void removeCookie()
    {
        if (cookiesInJar == 0)
        {
            System.out.println("Jar: No more cookies");
        }
        else
        {
            cookiesInJar--;
            System.out.println(name + " Omnomom One delicious cookie for you!");
            System.out.println(name + " " + cookiesInJar + " cookies left");
        }
    }
}
