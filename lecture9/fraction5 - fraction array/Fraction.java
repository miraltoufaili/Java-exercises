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

    public String toString()
    {
        return num + "/" + denom;
    }

    public void multiplyBy(Fraction other)
    {
        num *= other.num;
        denom *= other.denom;
    }
}
