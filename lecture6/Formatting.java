class Formatting
{

    // Formatting in a table with columns of with 10
    public static void main(String[] args)
    {
        String n1 = "Michael";
        int idNum1 = 34282394;

        String n2 = "Mary";
        int idNum2 = 925342;

        System.out.printf("name: %-10s id: %010d \n", n1, idNum1);
        System.out.printf("name: %-10s id: %010d \n", n2, idNum2);
    }
}
