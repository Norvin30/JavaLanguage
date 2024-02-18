import java.util.Scanner;

public class if_else13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of AB:");
        float ab = sc.nextFloat();

        System.out.println("Enter length of BC:");
        float bc = sc.nextFloat();

        System.out.println("Enter length of CD:");
        float cd = sc.nextFloat();

        System.out.println("Enter degree of angle A:");
        float a = sc.nextFloat();

        System.out.println("Enter degree of angle B:");
        float b = sc.nextFloat();

        System.out.println("Enter degree angle of C:");
        float c = sc.nextFloat();

        if (ab == bc && bc == cd && a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (ab == bc || bc == cd || ab == cd || a == b || b == c || c == a) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}
