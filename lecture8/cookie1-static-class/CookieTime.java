class CookieTime
{

    public static void main(String[] args)
    {
        // Static class model of a cookie jar
        // DONT USE THIS -- Need a separate class for each
        // different cookie jar.
        // See folder cookie2-objects for how to implement with
        // objects
        CookieJar jar1 = new CookieJar();
        CookieJar jar2 = new CookieJar();
        jar1.removeCookie();   
        jar1.removeCookie();   
        jar2.removeCookie();   
    }
}
