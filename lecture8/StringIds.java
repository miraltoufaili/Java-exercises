class StringIds
{
    public static void main(String[] args)
    {
        String x = "Monkeys";
        String y = "Donkeys";

        int id1 = System.identityHashCode(x);
        int id2 = System.identityHashCode(y);

        // prints the id numbers of the two Strings -- will be different
        System.out.println(id1);
        System.out.println(id2);
    }
}

