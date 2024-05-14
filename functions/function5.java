// Take user input of three numbers and make a function to print their average
package functions;

import java.util.Scanner;

public class function5 {
    public static int printAverage(int a, int b, int c){
        int average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a,b & c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = printAverage(a,b,c);
        System.out.println("Average of three numbers: "+average);
    }
}
