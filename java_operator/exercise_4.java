//Find the Largest of Three Numbers

package java_operator;

public class exercise_4 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;

        int largest = (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;
        System.out.println("The largest number is: " + largest);
    }
}
