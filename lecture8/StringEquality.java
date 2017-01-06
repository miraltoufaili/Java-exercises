class StringEquality
{

    public static void main(String[] args)
    {
        String hmmmm = "Hello World".substring(0, 5);
        String whaaaa = "Hello";

        System.out.println(hmmmm);
        System.out.println(whaaaa);

        // QUESTION: What does this print out?
        // ANSWER false
        System.out.println(whaaaa == hmmmm);

        // QUESTION: What does this print out?
        // ANSWER true
        System.out.println(whaaaa.equals(hmmmm));

        // QUESTION: Are these the same or different
        // ANSWER different
        System.out.println(System.identityHashCode(hmmmm));
        System.out.println(System.identityHashCode(whaaaa));

        whaaaa = hmmmm;

        // QUESTION: What does this print out now?
        // ANSWER true -- they now both refer to the exact same string
        // in memory
        System.out.println(whaaaa == hmmmm);

        // QUESTION: Are these the same or different?
        // ANSWER and they have the same id
        System.out.println(System.identityHashCode(hmmmm));
        System.out.println(System.identityHashCode(whaaaa));


    }
}
