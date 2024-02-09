
/*Take two different string input and print them in same line. E.g.-*/
import java.util.Scanner;

public class userinputstring {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string1:");
        String string1= sc.nextLine();
        System.out.println("Enter string2:");
        String string2= sc.nextLine();
        System.out.println(string1+string2);
    }
}
