import java.util.Scanner;

public class floyds_triangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int r = sc.nextInt();
        int number = 1;
        for (int i =1; i<=r; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}