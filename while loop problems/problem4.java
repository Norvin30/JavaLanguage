
import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while ( i<= n) {
            sum+=i;
            i+=2;
        }
        System.out.println("Sum of even numbers  from 1 to"+n+"is"+":"+sum);
    }
}
