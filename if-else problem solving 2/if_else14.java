import java.util.Scanner;

public class if_else14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Person:");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("Eligible for voting");
        }else {
            System.out.println("Not Eligible for voting");
        }
    }
}
