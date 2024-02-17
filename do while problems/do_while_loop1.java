import java.util.Scanner;

public class do_while_loop1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i<=n);
    }
}
