import java.util.Arrays;

class ArrayMystery 
{

    public static void main(String[] args) 
    {
      int[] a = {1, 7, 5, 6, 4, 14, 11};

      // careful!
      // because we are looking at a[i+1],
      // we need to not let i be a.length -1
      // if it were, then a[i+i] would be
      // a[a.length], which would be out of bounds
      for (int i = 0; i < a.length - 1; i++) 
      {
          if (a[i] > a[i + 1]) {
              a[i + 1] = a[i + 1] * 2;   
          }
      }
      System.out.println(Arrays.toString(a));
      // ANSWER:
      // prints [1, 7, 10, 12, 8, 14, 22]
    }

}
