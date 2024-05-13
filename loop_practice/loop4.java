//Write a program to find the factorial value of any number
// entered through the keyboard.

package loop_practice;
import java.util.Scanner;
public class loop4 {
    public class FactorialDemo1
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            int fact = 1; // To hold factorial

            System.out.print("Enter any positive integer: ");
            int num = sc.nextInt();

            for(int i=1; i<=num; i++)
            {
                fact = fact * i;
            }

            System.out.println("Factorial: "+ fact);
        }
    }
}
