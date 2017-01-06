import java.util.Arrays;

class PayScales
{

    public static void main(String[] args)
    {
        double[][] payRates = {
            { 10.50, 12.00, 14.50, 16.75, 18.00 },
            { 20.50, 22.25, 24.00, 26.25, 28.00 },
            { 34.00, 36.50, 38.00, 40.35, 43.00 },
            { 50.00, 60.00, 70.00, 80.00, 99.99 }
        };


        // PROBLEM: Give everyone a $5.25 per hour raise!
        // ANSWER
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 5; ++j) {
                payRates[i][j] += 5.25;
            }
        }

        // Even better
        for (int i = 0; i < payRates.length; ++i) {
            for (int j = 0; j < payRates[i].length; ++j) {
                payRates[i][j] += 5.25;
            }
        }
        
        // PROBLEM: Find the average hourly pay
        // for the seniority level 2 employees
        // ANSWER:
        double sum = 0;
        int N = 5;  // OR payRates[2].length
        for (int j = 0; j < N; ++j) {
            sum += payRates[2][j];
        }
        System.out.printf("Average level 2 salary is + %.2f\n", sum / N);

    }

}
