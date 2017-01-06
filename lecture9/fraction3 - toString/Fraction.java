class Fraction
{

    private int num;

    private int denom;

    public Fraction(int a, int b)
    {
        num = a;
        denom = b;
    }

    public int getNumerator()
    {
        return num;
    }

    public int getDenominator()
    {
        return denom;
    }

    public void addOne() 
    {
        num += denom;
    }

    // PROBLEM: Add a toString method so we can print it out nicely
    // ANSWER:
    public String toString()
    {
        return num + "/" + denom;
    }
}
