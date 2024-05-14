package functions;

import java.util.Scanner;
public class function7 {

    public class Circle {
        public static double calculateCircumference(double radius) {

            double circumference = 2 * Math.PI * radius;
            return circumference;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius of the circle: ");
            double radius = sc.nextDouble();

            double circumference = calculateCircumference(radius);
            System.out.println("Circumference of the circle is: " + circumference);
        }
    }

}
