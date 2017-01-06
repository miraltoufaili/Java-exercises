class CookieTime
{
    public static void main(String[] args)
    {
        CookieJar jar1 = new CookieJar();
        CookieJar jar2 = new CookieJar();

        jar1.removeCookie(); // 2 cookies left
        jar1.removeCookie(); // 1 cookie left
        
        System.out.println();
        jar2.removeCookie(); // 2 cookies left (different jar)

        System.out.println();
        jar1.removeCookie();  // 0 cookies left 
    }
}
