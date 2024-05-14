// Write a function to print sum of all odd numbers from 1 to n.

package functions;

import java.util.Scanner;

public class function6 {
    public static void printOddnumber(int n){
        if (n==0){
            System.out.println("0 is neither odd nor even");
            return;
        }
        int sum = 0;
        for (int i = 1; i<=n; i++){
            if (i%2 !=0){
                sum = sum +i;
            }

        }
        System.out.println("Sum is:"+ sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        printOddnumber(n);
    }


}
