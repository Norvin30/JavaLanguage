// Make a function to add two numbers and return sum

package functions;
import java.util.Scanner;

public class functions3 {
    public static int calculateProduct(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculateProduct(a,b);
        System.out.println("Product of two numbers is: "+product);

    }

}
