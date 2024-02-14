import java.util.Scanner;

public class digit_alphabet_specialcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check its type:");
        char input = sc.next().charAt(0);

        if (Character.isDigit(input)) {
            System.out.println("The input is a digit.");
        } else if (Character.isLetter(input)) {
            System.out.println("The input is an alphabet.");
        } else {
            System.out.println("The input is a special character.");
        }
    }
}
