package java_operator;

import java.util.Scanner;

public class logical_operator_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter boolean value for x & y:  ");
        boolean x = sc.nextBoolean();
        boolean y = sc.nextBoolean();

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}
