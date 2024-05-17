package array;

import java.util.Scanner;

public class array_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i=0; i<size; i++){
            numbers[i]= sc.nextInt();
        }
        for (int i =0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }

}
