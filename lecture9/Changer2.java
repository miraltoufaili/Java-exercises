import java.util.Arrays;

class Changer2
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
        // ANS: prints 
        // 5
        // falafel
        // [9, 1, 7, 3]
    }

    public static void mystery(int x, String y, int[] z)
    {
        x = 0;
        y = "";

        int[] myArray = { 4, 5, 6};
        z = myArray;
    }

}
