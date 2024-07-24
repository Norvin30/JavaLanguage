// Reverse a string
package string_excercise_java;

import java.io.*;
import java.util.Scanner;

public class ex3 {
        public static void main (String[] args) {

            String str= "Geeks", nstr="";
            char ch;

            System.out.print("Original word: Geeks");

            for (int i=0; i<str.length(); i++)
            {
                ch= str.charAt(i);
                nstr= ch+nstr;
            }
            System.out.println("Reversed word: "+ nstr);
        }
    }




