class Methods2 {

    // QUESTION:
    // Analyze this program from the bottom up to
    // figure out what it is printing
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
