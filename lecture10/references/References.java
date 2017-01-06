import java.util.Arrays;

class References
{

    public static void main(String[] args)
    {
        int x = 3;
        int y = x;
        y = 5;   
        System.out.println(x + "  " + y);

        String a = "Boris";
        String b = a;
        b = "Theresa";   
        System.out.println(a + "  " + b);

        int[] p = { 1, 2, 3};
        int[] q = p;
        q = new int[] { 4, 5, 6};  
        System.out.println(Arrays.toString(p) + "  " + Arrays.toString(q));

        q = p;
        q[0] = 999;
        System.out.println(Arrays.toString(p) + "  " + Arrays.toString(q));

        Fraction f = new Fraction(3, 17);
        Fraction g = f;
        f.addOne();
        System.out.println(f + "  " + g);
    }
}
