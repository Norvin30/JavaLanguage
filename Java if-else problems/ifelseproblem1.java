

import java.util.Scanner;

public class ifelseproblem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();

        if (num1>num2){
            System.out.println("greatest among two numbers is :"+num1);
        }
        else {
            System.out.println("greatest among two numbers is :"+num2);
        }

    }
}
