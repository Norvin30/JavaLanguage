//Input is a alphabet or not

import java.util.Scanner;

public class alphabetornot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");
        char ch = sc.next().charAt(0);

        if (ch>='A' && ch<='Z'|| ch>='a' && ch<='z'){
            System.out.println("Input is alphabet");
        }
        else {
            System.out.println("Input is not a alphabet");
        }
    }
}