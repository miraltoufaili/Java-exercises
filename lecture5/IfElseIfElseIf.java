class IfElseIfElseIf 
{
    public static void main(String[] args)
    {
        int score = 99;
        char letterGrade;
        // PROBLEM: write a chained if test
        // convert the raw score to a letter grade
        // 90s - A, 80s - B, 70s - C, 60s - D, less - F 
        //
        // ANSWER:
        if (score >= 90) {
            letterGrade = 'A';
        } else if (score >= 80) {
            letterGrade = 'B';
        } else if (score >= 70) {
            letterGrade = 'C';
        } else if (score >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
 
        System.out.println("Letter grade is: " + letterGrade);
    }
}
