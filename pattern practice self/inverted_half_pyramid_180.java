import java.util.Scanner;

public class inverted_half_pyramid_180 {
    public static void main(String[] args){
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter rows:");
        int r = sc.nextInt();

        for(int i =1; i<=r; i++){
            for (int j =1; j<=r-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
