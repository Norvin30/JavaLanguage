package array;

import java.util.Scanner;

public class array_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] marks = new int[size];

        for (int i =0; i<size; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter the number to find: ");
        int x = sc.nextInt();

        for (int i = 0; i< size; i++){
            if (marks[i] == x){
                System.out.println("x found at index: "+i);
            }
        }
    }
}
