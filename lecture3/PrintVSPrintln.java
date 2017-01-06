class PrintVSPrintln {

    public static void main(String[] args)
    {
        // Some simple prints
        // QUESTION: What is the difference between these
        // two prints and the next two?

        System.out.println("Hello world!");
        System.out.println("Hello world!");

        // ANSWER: no newline at the end with print
        System.out.print("Hello world!");
        System.out.print("Hello world!");

        // QUESTION: What character(s) could you add inside the quotes of the
        // second two lines to make them like the first two?
        // ANSWER: \n
    }
}
