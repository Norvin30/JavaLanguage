import java.util.Scanner;

public class triangle_1_0 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        int i,j;
        for (i=1; i<=n; i++){
            for (j=1; j<=i; j++){
                int sum = i + j;
                if (i %2 == 0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
