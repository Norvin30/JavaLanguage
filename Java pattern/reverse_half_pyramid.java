import java.util.Scanner;

public class reverse_half_pyramid {
    public static void main(String[] args){
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        for (i=1; i<=n; i++){
            for (j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
