
import java.util.Scanner;

public class sum_of_even_no_from_1_to_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int sum=0;
        for (int i =2; i<=n; i+=2){
            sum+=i;
        }
        System.out.println("Sum of even numbers  from 1 to"+n+"is"+sum);
    }
}
