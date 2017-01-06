import java.util.Arrays;

class TwoRandoms {

    public static void main(String[] args) 
    {
        // PROBLEM: write a method that returns
        // two random values between 0 and 1
        double[] rands = twoRandoms();
        System.out.println(Arrays.toString(rands));
    }
    
    // ANSWER
    public static double[] twoRandoms()
    {
        double[] answer = { Math.random(), Math.random() };
        return answer;
        
        // OR
        // return new double[]{ Math.random(), Math.random() };
    }
}
