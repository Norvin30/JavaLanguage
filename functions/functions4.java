// make a function to print factorial of number
package functions;

import java.util.Scanner;

public class functions4 {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.print(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        printFactorial(n);
    }
}
