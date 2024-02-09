import java.util.Scanner;

public class userinput{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x = sc.nextInt();
        System.out.println("Enter value of y:");
        int y = sc.nextInt();

        System.out.println("Addition:"+(x+y));
        System.out.println("Product:"+(x*y));
    }
}