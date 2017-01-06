class Fourth
{
    public static void main(String[] args)
    {
        int month  = 5;
        int day = 5;
        // is this month + day after the fourth of july??
        if ((month > 7) || (month == 7 && day > 4))
        {
            System.out.println("It's after the fourth");
        } else {
            System.out.println("It's not!");
        }
    }
}
