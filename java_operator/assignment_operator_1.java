package java_operator;

public class assignment_operator_1 {
    public static void main(String[] args) {
        int a = 25;
        int b = 2500;

        a += b; // a = a + b
        System.out.println("a += b: " + a);

        a -= b; // a = a - b
        System.out.println("a -= b: " + a);

        a *= b; // a = a * b
        System.out.println("a *= b: " + a);

        a /= b; // a = a / b
        System.out.println("a /= b: " + a);

        a %= b; // a = a % b
        System.out.println("a %= b: " + a);
    }
}
