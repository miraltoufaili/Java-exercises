class ArrayStuff
{
    public static void main(String[] args)
    {
        int[] a = new int[]{ (9 * 11), 2, 7, 4, 10};   
        a[1] = 500;
        System.out.println(a[0]);     // prints 99
        System.out.println(a[1]);     // prints 500
        System.out.println(a[2]);     // 7
//        System.out.println(a[100]);  ArrayIndexOutOfBoundsError
        
        // can have array of any type
        char[] arr2 = { 'a', 'b', 'y' , 'z', 'z', 'z', 'z'};   


        boolean[] arr3 = { true, true, true, (13 < 4) };   
        System.out.println(arr3[arr3.length - 1]);  // prints false
        
        String[] arr4 = { "Hey", "there", "!!!" };  // prints there
        System.out.println(arr4[1]);
        
        int[] arr5 = new int[100];     // prints 0, default value constructor
        System.out.println(arr5[0]);
        
    }
}