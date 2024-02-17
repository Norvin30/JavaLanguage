import java.util.Scanner;

public class do_while_loop8 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        do {
            temp /= 10;
            count++;
        }while (temp!=0);
        System.out.println(count);
    }
}
