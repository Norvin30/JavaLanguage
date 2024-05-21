// take matrix as user input. Search for a given number X and
// print the indices at which it occurs

package Array_2D;

import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element to be found: ");
        int x = sc.nextInt();

         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x){
                    System.out.println("x found at location ("+i+","+j+")");
                }
            }
        }


    }
}
