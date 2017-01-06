class Seasons
{
    // The starts of the seasons for 2016
    public static final Date START_OF_SPRING = new Date(3, 20);
    public static final Date START_OF_SUMMER = new Date(6, 20);
    public static final Date START_OF_FALL   = new Date(9, 22);
    public static final Date START_OF_WINTER = new Date(12, 21);

    public static void main(String[] args)
    {
        Date d = new Date(7, 19);
        String season = season(d);
        System.out.println(season);
    }

    // Object way to solve the season problem
    // Pass the date as an object instead of two ints
    // the logic for isBefore is in Date.java, separated from here:
    public static String season(Date d)
    {
        if (d.isBefore(START_OF_SPRING))
        {
            return "WINTER";
        }
        else if (d.isBefore(START_OF_SUMMER))
        {
            return "SPRING";
        }
        else if (d.isBefore(START_OF_FALL))
        {
            return "SUMMER";
        }
        else if (d.isBefore(START_OF_WINTER))
        {
            return "FALL";
        }
        else
        {
            return "WINTER";
        }            
    }
}
