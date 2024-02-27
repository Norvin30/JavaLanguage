import java.util.Scanner;

public class loop_java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int i;
        int m=10;
        for (i=1; i<=m; i++){
            System.out.println(n+"x"+i+"="+i*n);
        }
    }
}
