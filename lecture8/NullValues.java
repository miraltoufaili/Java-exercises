
class NullValues {

    public static void main(String[] args) {
        // null means "no object", or to be named later
        // PROBLEM: What happens when you try to use null?
        String player = null;
        System.out.println(player);                           // prints null
        System.out.println(System.identityHashCode(player));  // prints 0
        System.out.println(player.length());   // Error: NullPointerException
    }
}
