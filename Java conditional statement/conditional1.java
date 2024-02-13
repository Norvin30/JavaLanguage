/*Write a Java program to get a number from the user and
print whether it is positive or negative./
 */

import java.util.Scanner;

public class conditional1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();

        if (num > 0)
        {
            System.out.println("Number is positive");
        }
        else if (num < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}
