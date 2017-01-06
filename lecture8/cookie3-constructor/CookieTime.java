class CookieTime
{
    public static void main(String[] args)
    {
        // Pass in different values for the different jars
        CookieJar jar1 = new CookieJar(5, "Choco Chip");
        CookieJar jar2 = new CookieJar(10, "Oreo");

        jar1.removeCookie();
        jar2.removeCookie();

    }
}
