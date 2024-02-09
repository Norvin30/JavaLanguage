package JavaUserinputproblems;

/*Take two integer inputs from user. First calculate the sum of two then
product of two. Finally, print the sum and product of both obtained results.
 */
import java.util.Scanner;

public class rectanglearea {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter values of x&y:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double add= x+y;
        double product=x*y;
        System.out.println("Sum of x&y:"+add+" & product of x&y:"+product);


    }
}
