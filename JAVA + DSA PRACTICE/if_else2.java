import java.util.Scanner;

public class if_else2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num % 2 != 0){
            System.out.println("NUMBER IS ODD");
        }
        else if (num == 0){
            System.out.println("0 IS NEITHER A ODD NUMBER NOR A EVEN NUMBER");
        }
        else {
            System.out.println("NUMBER IS EVEN");
        }
    }
}
