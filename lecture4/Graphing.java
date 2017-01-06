class Graphing {

    public static void main(String[] args)
    {
        // Not a Problem.
        // Just for fun:
        // Your very own graphing calculator
        for (int x = -30; x <= 30; ++x)
        {
            for (int y = -30; y <= 30; ++y)
            {
                if (y == (int) (25 * Math.sin(x/5.0))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
