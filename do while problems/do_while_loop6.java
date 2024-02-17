import java.util.Scanner;

public class do_while_loop6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int result;
        int i = 1;
        int t;
        do {
            result=n*i;
            System.out.println(n+"*"+i+"="+result);
            i++;

        }while (i<=10);

    }
}
