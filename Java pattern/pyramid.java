package javadatatypeproblems;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int i,j;
        for (i=1; i<=n; i++){
            for (j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
