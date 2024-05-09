import java.util.Scanner;

public class solid_rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of cols & rows : ");
        int c = sc.nextInt();
        int r = sc.nextInt();

        for (int i = 1; i<=r; i++){
            for (int j = 1; j<=c; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
