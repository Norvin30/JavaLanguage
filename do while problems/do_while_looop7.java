import java.util.Scanner;

public class do_while_looop7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int sum = 0;
        int temp;

        do {
            temp = n %10;
            sum = sum + temp;
            n = n/10;
        }while (n>0);
        System.out.println(sum);
    }
}
