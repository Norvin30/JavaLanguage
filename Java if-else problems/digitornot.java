// Digit or not
import java.util.Scanner;

public class digitornot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit:");
        char ch = sc.next().charAt(0);

        if (ch>=0 && ch<=9){
            System.out.println("Input is a Digit");
        }
        else {
            System.out.println("Input is not a digit");
        }
    }
}
