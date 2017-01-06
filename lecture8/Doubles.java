class Doubles
{

    public static void main(String[] args)
    {
        // ADVANCED
        double d = 0.2999999999999999;
        for (int i = 0; i < 10; i++)
        {
            System.out.println(d);
            d = Math.nextUp(d);
        }
        // These are the closest doubles there are around 0.3
        // if you try to use a double value in between any of these
        // it will be rounded to the nearest one.
        
        // 0.2999999999999999
        // 0.29999999999999993
        // 0.3
        // 0.30000000000000004
        // 0.3000000000000001
        // 0.30000000000000016
        // 0.3000000000000002
        // 0.30000000000000027
        // 0.3000000000000003
        // 0.3000000000000004
    }
}





















//        double d = 0.2999999999999999;
////        float d = 0.9999999f;
//        for (int i = 0; i < 10; i++)
//        {
//            System.out.println(d);
//            d = Math.nextUp(d);
//        }
