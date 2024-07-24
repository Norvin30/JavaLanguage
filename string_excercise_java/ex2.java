//Java program to print Even length words in a String
package string_excercise_java;

public class ex2 {
        public static void printWords(String s)
        {
            for (String word : s.split(" "))
                if (word.length() % 2 == 0)
                    System.out.println(word);
        }
        public static void main(String[] args)
        {

            String s = "i am Geeks for Geeks and a Geek";
            printWords(s);
        }
    }


