class FindTheBug
{
   // What is wrong here?
   // ANSWER: this will loop forever
   public static void main(String[] args)
   {
      for (int i = 1; i <= 5; i++)
      {
          // should be j <= 10
          for (int j = 1; i <= 10; j++)
          {
              System.out.print ("*");
          }
          System.out.println ();
      }

   }
}
