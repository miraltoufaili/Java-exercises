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

    // PROBLEM
    // Implement a method that increments your fraction by one
    // ANSWER:
    public void addOne()
    {
        num += denom;
    }
}
