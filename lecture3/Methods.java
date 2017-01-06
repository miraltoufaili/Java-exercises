class Methods {

    // QUESTION:
    //  What does the following program print out?
    // ANSWER:
    //
    // A
    // B
    // X
    // Y
    public static void main(String[] args) {
        methodA();
        System.out.println("Y");
    }

    public static void methodA() {
        System.out.println("A");
        methodB();
        System.out.println("X");
    }

    public static void methodB() {
        System.out.println("B");
    }
}
