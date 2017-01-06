import java.util.Scanner;

class StringPractice
{

    public static void main(String[] args) 
    {
        String s = "Abra cadabra";
        // QUESTION: What do these print out?
        // ANSWERS:
        System.out.println(s.indexOf('A'));        // 0
        System.out.println(s.indexOf('a'));        // 3
        System.out.println(s.lastIndexOf('a'));    // 11
        System.out.println(s.indexOf('a', 4));     // 6
        System.out.println(s.indexOf('n'));        // -1 (not found)
        System.out.println(s.indexOf("br"));       //  1
        System.out.println(s.contains("cadaver")); // false
        
        System.out.println(s.substring(4));        //  cadabra
        System.out.println(s.substring(5, 8));     // dab
        System.out.println(s.endsWith("ra"));      // true

        String t = "Hello";
        System.out.println(t.replace("H", "J"));   // Jello
        System.out.println(t.equals("Hello"));     // true

    }
}
