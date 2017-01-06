import java.util.Scanner;

class Scanning 
{

    // PROBLEM: write code that
    // asks the user for a number
    // and says nice things if it is 7 or 11
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = keyboard.nextDouble();
        if (num == 7 || num == 11) {
            System.out.println("That's a great number!");
        } else {
            System.out.println("That's a terrible number!");
        }
        
    }
}
