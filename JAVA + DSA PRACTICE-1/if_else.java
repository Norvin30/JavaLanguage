import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the AGE: ");
        int  a = sc.nextInt();

        if (a>18){
            System.out.println("PERSON IS A ADULT");
        }
        else {
            System.out.println("PERSON IS NOT A ADULT");
        }
    }
}
