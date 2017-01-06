class FractionExample
{

    public static void main(String[] args)
    {
        Fraction f = new Fraction(1, 2);
        f.addOne();

        System.out.println("f num after change " + f.getNumerator());
        System.out.println("f denom after change " + f.getDenominator());
    }

}
