import java.util.Scanner;

public class do_while_loop3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        int i = 0;
        do {
            System.out.println(2*i+1);
            i++;
        }while (i<=n);
    }
}
