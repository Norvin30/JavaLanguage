
import java.util.Scanner;

public class mul_of_no {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int i;
        System.out.println("Multiplication of number"+n+"is"+":");
        for (i=1; i<=20; i++){
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
