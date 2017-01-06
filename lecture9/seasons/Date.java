class Date
{
    private int month;
    private int day;
    
    public Date(int m, int d)
    {
        month = m;
        day = d;

        if (badDate()) 
        {
         throw new IllegalArgumentException("Bad date: " + m + "/" + d);
        }
    }

    // return true if this object's date is before the specified date
    public boolean isBefore(Date d)
    {
        if (month < d.month) 
        {
            return true;
        }
        if (month == d.month && day < d.day)
        {
            return true;
        }
        return false;
    }
    
    
    private boolean badDate()
    {
        if (day <= 0 || day > 31)
        {
            return true; 
        }

        if (month <= 0 || month > 12)
        {
            return true; 
        }

        if ((month == 9 || month == 4 || month == 6 || month == 11) && (day > 30))
        {
            return true;
        }

        if (month == 2 && day > 28)
        {
            return true; 
        }

        return false;
    }
}