import java.util.Arrays;

class Args
{

    public static void main(String[] args) 
    {
        // will print out the argments passed out on the command line
        // java Args hello how are you
        // will print
        // [ hello, how, are, you ]
        System.out.println(Arrays.toString(args));
    }
}
