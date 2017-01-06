class Looping {

  public static void main(String[] args) {
      //  SIMPLE LOOPING

      // QUESTION:
      //  What does this do?
      // ANSWER:
      //  Prints the numbers 1 through 10, each on a new line
      for (int i = 1; i <= 10; i = i + 1) {
          System.out.println(i);
      }

      //  SIDE NOTE: (advanced/optional for now)
      //  This also counts to 10, does the same as the above
      //  and is very similar to the repeat-until loop in scratch
      int j = 1;
      while (j <= 10) {
          System.out.println(j);
          j = j + 1;
      }

      // PROBLEM: 
      //  Change the first for loop to print 1 to 10 all on one line.
      // ANSWER:
      for (int i = 1; i <= 10; i++) {
          System.out.print(i + " ");  // note print, not println
      }
      System.out.println();

      // PROBLEM: 
      //  Change the first for loop to print the even numbers from 0 to 20
      // ANSWER 1:
      for (int i = 0; i <= 20; i = i + 2) {
          System.out.println(i);
      }

      // ANSWER 2: (a more math-y use of a formula instead of a counter)
      for (int i = 0; i <= 10; i = i + 1) {
          System.out.println(2 * i);
      }

      // PROBLEM: 
      //  Change the first for loop to count down from 10 to -1
      // ANSWER:
      for (int i = 10; i > -2; i -= 1) {
          System.out.println(i);
      }

      // QUESTION: 
      //  How many times does this run?
      // ANSWER:
      //  0 times! The condition is never satisfied.
      for (int i = 10; i > 20; i = 2 + i) {
          System.out.println(i);
      }

      // QUESTION: 
      //  What does this print?
      // ANSWER:
      //  1
      //  10
      //  100
      //  1000
      for (int i = 1; i < 10000; i *= 10) {
          System.out.println(i);
      }
  }
}
