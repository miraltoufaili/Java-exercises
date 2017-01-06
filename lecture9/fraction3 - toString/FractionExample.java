class FractionExample
{

    public static void main(String[] args)
    {
        Fraction f = new Fraction(1, 2);
        f.addOne();

        // we can just print f directly if it has a toString
        // println will automatically find it
        System.out.println("f after change " + f);
    }

}
