// Write a program that prompts the user to input a positive integer
//  It should then print the multiplication table of that number.

package loop_practice;

import java.util.Scanner;

public class loop3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any positive integer: ");
         int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num);

        for(int i=1; i<=10; i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
    }
}
