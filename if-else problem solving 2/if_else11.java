import java.util.Scanner;

public class if_else11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage:");
        int p = sc.nextInt();

        if (p>=60){
            System.out.println("Division 1");
        } else if (p>=45) {
            System.out.println("Division 2");
        } else if (p>=30) {
            System.out.println("Division 3");
        }else {
            System.out.println("FAIL");
        }
    }
}
