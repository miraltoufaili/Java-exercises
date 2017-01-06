import java.util.Arrays;

class FractionArray
{
    public static void main(String[] args)
    {
        Fraction x = new Fraction(1, 2);
        Fraction y = new Fraction(3, 4);

        // can make arrays of your own objects
        Fraction[] fracs = { x, y, new Fraction(9, 10) };

        System.out.println(Arrays.toString(fracs));
    }
}
