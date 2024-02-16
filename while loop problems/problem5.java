import java.util.Scanner;

public class problem5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int i = 2;
        int sum = 0;
        while (i<=n){
            sum+=i;
            i+=2;
        }
        System.out.println("sum of odd numbers:"+":"+sum);
    }
}
