import java.util.Scanner;

public class switch1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter switch no. : ");
        int s = sc.nextInt();

        switch (s){
            case 1:
                System.out.println("HELLO");
                break;
            case 2:
                System.out.println("NAMASTE");
                break;
            case 3:
                System.out.println("BONJOUR");
                break;
            default:
                System.out.println("Enter valid switch no. ");
        }
    }
}
