import java.util.Scanner;

public class if_else17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        if (n %11==0){
            System.out.println("Number is divisible by 11.");
        }
        else {
            System.out.println("Number is not divisible by 11");
        }
    }
}
