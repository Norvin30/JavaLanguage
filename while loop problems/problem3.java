
import java.util.Scanner;
// print odd no.
public class problem3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int i=0;
        while (i<=n){
            if (i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }
}
