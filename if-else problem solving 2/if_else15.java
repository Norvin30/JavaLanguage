import java.util.Scanner;

public class if_else15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        if (n < 0){
            System.out.println("Number is negative");
        } else if (n==0) {
            System.out.println("0 is not a positive number nor a negative number");
        } else {
            System.out.println("Number is positive");
        }
    }
}
