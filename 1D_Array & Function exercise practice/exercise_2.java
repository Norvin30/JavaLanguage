// Write a function which takes in 2 numbers as input  and
// returns greater of two numbers

package functions_exercise;

import java.util.Scanner;

public class exercise_2 {
    public static void greatestNumber(int a, int b){
        if (a>b){
            System.out.println("a is the greatest");
        }else {
            System.out.println("b is the greatest");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        greatestNumber(a,b);
    }
}
