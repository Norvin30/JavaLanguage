import java.util.Scanner;

public class pyramid_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int i, j, k;
        for (i = 1; i <= n; i++){
            for (k = n; k > i; k--){
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}