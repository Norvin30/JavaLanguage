//String Equals method

package string_excercise_java;
import java.io.*;

public class ex4 {
        public static void main(String[] args)
        {
            String str1 = "Learn Java";
            String str2 = "Learn Java";
            String str3 = "Learn Kotlin";
            boolean result;

            result = str1.equals(str2);
            System.out.println(result);


            result = str1.equals(str3);

            System.out.println(result);


            result = str3.equals(str1);
            System.out.println(result);
        }
    }


