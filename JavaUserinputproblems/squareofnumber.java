
import java.util.Scanner;

/*Write a program to find square of a number.*/
public class squareofnumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        System.out.println("Square of " + num+" = "+(num*num));
    }

}
