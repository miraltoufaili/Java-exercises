class Goldilocks
{

    public static void main(String[] args)
    {
        goodTemperature();
    }

    // PROBLEM:
    // Write a method that prints
    // -- Too Cold! if temp is < 70
    // -- Too Hot! if temp is >= 90
    // -- Just Right! if temp is between those two
    public static void goodTemperature() 
    {
        int temp = 80;
        if (temp < 75) {
            System.out.println("Too cold!");
        } else if (temp >= 85) {
            System.out.println("Too hot!");
        } else {
            System.out.println("Just right!");
        }
    }
}
