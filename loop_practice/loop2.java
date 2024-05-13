// Write a program to calculate the sum of first 10 natural number.
package loop_practice;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
