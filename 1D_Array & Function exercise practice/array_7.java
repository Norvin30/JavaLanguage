package array;

import java.util.Scanner;

public class array_7 {
    public static void main(String[] args) {
    int[] numbers={12,14,151,13,16};
    int sum=0;
    for (int i = 0; i< numbers.length; i++){
        sum += numbers[i];
    }
        System.out.println("Sum of array elements: "+ sum);
    }
}
