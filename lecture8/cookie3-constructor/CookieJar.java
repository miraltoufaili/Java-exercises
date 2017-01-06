class CookieJar
{
    private int cookiesInJar;

    private String name;

    // Use a constructor to give your class custom values.
    // Use the name below in the messages
    public CookieJar(int c, String n)
    {
        cookiesInJar = c;
        name = n;
    }

    public void removeCookie()
    {
        if (cookiesInJar == 0)
        {
            System.out.println(name + ": No more cookies");
        }
        else
        {
            cookiesInJar--;
            System.out.println(name + " Omnomom One delicious cookie for you!");
            System.out.println(name + " " + cookiesInJar + " cookies left");
        }
    }
}
