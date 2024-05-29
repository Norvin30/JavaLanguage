package java_operator;

import java.util.Scanner;

public class assignment_operator_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a & b :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a += b;
        System.out.println("a += b: " + a);

        a -= b;
        System.out.println("a -= b: " + a);

        a *= b;
        System.out.println("a *= b: " + a);

        a /= b;
        System.out.println("a /= b: " + a);

        a %= b;
        System.out.println("a %= b: " + a);
    }
}
