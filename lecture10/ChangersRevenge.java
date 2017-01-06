import java.util.Arrays;

class ChangersRevenge
{

    public static void main(String[] args)
    {
        int a = 5;
        String b = "falafel";
        int[] c = { 9, 1, 7, 3 };

        mystery(a, b, c);

        // QUESTION: what do these print out?
        // ANSWER:
        System.out.println(a);   // 5
        System.out.println(b);   // falafel
        System.out.println(Arrays.toString(c));   // [ 9, 99999, 7, 3 ]
    }

    public static void mystery(int x, String y, int[] z)
    {
        x = 0;
        y = y + " mmmm";

        z[1] = 99999;
    }
}
