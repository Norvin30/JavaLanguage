package functions;

import java.util.Scanner;

public class function1 {
    public static void printMyname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        printMyname(name);
    }


}
