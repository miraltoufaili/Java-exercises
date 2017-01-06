class CookieTime
{
    public static void main(String[] args)
    {
        CookieJar jar1 = new CookieJar("Choco Chip");
        CookieJar jar2 = new CookieJar(10, "Oreo");

        jar1.removeCookie();
        jar2.removeCookie();
        
        System.out.println("Num cookies in jar1: "
            + jar1.getCookiesInJar());

    }
}
