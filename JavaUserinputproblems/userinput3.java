/*Take name, roll number and field of interest from user and print in the format below :
Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.*/
import java.util.Scanner;

public class userinput3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Hey my name is:");
        String name = sc.nextLine();
        System.out.println("and my roll number is:");
        int roll = sc.nextInt();
        System.out.println("My field of interest are:\n");
        String interest = sc.nextLine();
 System.out.println("\n Hi"+name+"your roll number is"+roll+ "and your field of interest are"+ interest);

        
    }
}
