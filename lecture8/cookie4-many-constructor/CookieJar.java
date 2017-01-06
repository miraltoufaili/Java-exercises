class CookieJar
{
    private int cookiesInJar;

    private String name;

    public CookieJar(int c, String n)
    {
        cookiesInJar = c;
        name = n;
    }

    // You can have multiple constructors (overloaded)
    // This constructor defaults to 25 cookies when no number
    // is specified
    public CookieJar(String n)
    {
        cookiesInJar = 25; 
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
