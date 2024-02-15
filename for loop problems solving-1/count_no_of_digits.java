
import java.util.Scanner;

public class count_no_of_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int count = 0;
        for (int temp = num; temp!= 0; temp /= 10 ){
            count++;
        }
        System.out.println("Count of numbers: "+count);
    }
}
