class CashRegister
{

    // Round the price reported to the cash register to two digits
    // ANSWER
    public static void main(String[] args)
    {
        double price = 9.99;
        double massTaxRate = 0.0625;
        double totalPrice = price + price * massTaxRate;
        System.out.printf("Your total is: %.2f\n", totalPrice);
    }
}
