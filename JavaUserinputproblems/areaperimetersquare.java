/*Take side of a square from user and print area and perimeter of it.*/

import java.util.Scanner;

public class areaperimetersquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        float side= sc.nextInt();

        System.out.println("Area of square of given side:"+(side*side));
        System.out.println("Perimeter of square of given side:"+(4*side));

    }
}
