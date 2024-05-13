// Two numbers are entered through the keyboard.
// Write a program to find the value of one number raised to the power of another
// . (Do not use Java built-in method)
package loop_practice;
import java.util.Scanner;
public class loop5 {


    public class PowerDemo
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            int base;
            int power;
            int result = 1;

            System.out.print("Enter the base number ");
            base = sc.nextInt();

            System.out.print("Enter the power ");
            power = sc.nextInt();

            for(int i = 1; i <= power; i++)
            {
                result *= base;
            }

            System.out.println("Result: "+ result);
        }
    }
}
