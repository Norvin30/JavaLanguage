// Check if a Number is Positive, Negative, or Zero

package java_operator;

public class exercise_1 {
    public static void main(String[] args) {
        int number = -5;
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("The number is: " + result);
    }
}
