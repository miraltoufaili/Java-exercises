class SeasonsOld
{
    public static void main(String[] args)
    {
        int month = 7;
        int day = 19;
        String season = season(month, day);
        System.out.println(season);
    }
    
    // A non-object way to return the season
    public static String season(int month, int day)
    {
        if (month < 3 || (month == 3 && day < 20))
        {
            return "WINTER";
        }
        else if (month < 6 || (month == 6 && day < 20))
        {
            return "SPRING";
        }
        else if (month < 9 || (month == 9 && day < 22))
        {
            return "SUMMER";
        }
        else if (month < 12 || (month == 12 && day < 21))
        {
            return "FALL";
        }
        else
        {
            return "WINTER";
        }
    }
}
