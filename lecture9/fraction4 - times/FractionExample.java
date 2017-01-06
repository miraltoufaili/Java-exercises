class FractionExample
{

    public static void main(String[] args)
    {
        Fraction f = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        f.multiplyBy(new Fraction(5, 6));

        System.out.println("f after multiplication: " + f);
    }

}
