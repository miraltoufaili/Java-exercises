class Changer
{

    public static void main(String[] args)
    {
        String s = "Clinton";
        int n = 6;
        changer(s, n);
        System.out.println(s + " " + n);
        // prints 
        // Clinton 6
    }

    public static void changer(String x, int y)
    { 
        x = x + "Sanders";
        y = y * 2;
    } 
}
