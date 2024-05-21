package Array_2D;

public class array_3 {

        public static void main(String[] args) {
            int rows = 3;
            int columns = 4;
            int[][] array = new int[rows][columns];


            int value = 1;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    array[i][j] = value++;
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }




