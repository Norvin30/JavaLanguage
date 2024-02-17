import java.util.Scanner;

public class do_while_loop2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int i = 2;
        do {
            System.out.println(2*i);
            i++;
        }while (i<=n);
    }
}
