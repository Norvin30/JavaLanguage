// Swap Two Numbers Without Using a Temporary Variable.

package java_operator;

public class exercise_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);
        // Using arithmetic operators
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
