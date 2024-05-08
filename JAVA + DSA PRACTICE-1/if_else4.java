import java.util.Scanner;

public class if_else4 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter swithc no. :");
        int s = sc.nextInt();
        if (s == 1){
            System.out.println("HELLO");
        } else if (s == 2) {
            System.out.println("NAMASTE");
        } else if (s == 3){
            System.out.println("BONJOUR");
        }
        else {
            System.out.println("ENTER VALID SWITCH NO");
        }
    }
}
