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

    // problem add a method times that multiplies this fraction by another fraction
    // ANSWER:
    public void multiplyBy(Fraction otherFrac)
    {
        num *= otherFrac.num;
        denom *= otherFrac.denom;
    }
}
