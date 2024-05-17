// Write a function that takes age as input and returns if that person is eligible
// to vote or not. A persons age>18 is eligible to vote.

package functions_exercise;

import java.util.Scanner;

public class exercise_1 {
    public static void printEligibility(int a){
        if (a>18){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int a = sc.nextInt();

        printEligibility(a);
    }

}
