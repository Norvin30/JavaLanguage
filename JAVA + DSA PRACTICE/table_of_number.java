import java.util.Scanner;

public class table_of_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();


        for (int i =1; i<=20; i++){
            System.out.println(n + "x" + i +"= "+n*i);
        }
    }
}
