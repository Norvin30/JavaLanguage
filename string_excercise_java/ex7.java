//Array ia equal or not.

package string_excercise_java;

import java.util.Arrays;

public class ex7
        {
        public static void main(String[] args)
        {
            // Initializing the first array
            int a[] = { 30, 25, 40 };

            // Initializing the second array
            int b[] = { 60, 25, 40 };
            boolean result = Arrays.equals(a, b);

            if (result == true){
                System.out.println("Two arrays are equal");
            }
            else {

                System.out.println("Two arrays are not equal");
            }
        }
    }


