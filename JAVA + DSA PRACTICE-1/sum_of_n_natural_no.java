// Print sum of n natural numbers

import java.util.Scanner;

public class sum_of_n_natural_no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i =1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of n natural numbers is :"+sum);
    }
}