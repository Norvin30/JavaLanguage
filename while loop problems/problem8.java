
import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int i = 1;
        while (i<=20){
            int result = n * i;
            i++;
            System.out.println(n+"*"+i+"="+result);
        }
    }
}
