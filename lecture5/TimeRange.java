class TimeRange
{
    public static void main(String[] args)
    {
        int hour   = 17;
        int minute = 36;
        // write a condition for it being between 3:15pm and 6:15pm
        // ANSWER (we are assuming 24 hour time)
        if ((hour == 16 && hour == 17) 
            || (hour == 15 && minute > 15) 
            || (hour == 18 && minute < 15))
        {
            System.out.println("You're in class");
        } else {
            System.out.println("You're doing homework");
        }
    }
}
