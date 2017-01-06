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
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
        // ANSWER:
        // prints
        // 5
        // falafel
        // [9, 99999, 7, 3]
        
        // we didn't modify the variable z below
        // we modified the common array that c and z point to
    }

    public static void mystery(int x, String y, int[] z)
    {
        x = 0;
        y = y + " mmmm";

        z[1] = 99999;
    }
}
