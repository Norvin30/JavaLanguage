
import java.util.Scanner;

public class do_while_loop5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i+=2;
        }while (i<=n);
        System.out.println("Sum of odd numbers from 1 to n is:"+sum);
    }
}
