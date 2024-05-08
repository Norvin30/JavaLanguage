import java.util.Scanner;

public class if_else3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a  & b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b){
            System.out.println("A AND B ARE EQUAL");
        } else if (a > b){
            System.out.println("A IS GREATER THAN B");
        }
        else {
            System.out.println("A IS LESSER THAN B");
        }
    }
}
