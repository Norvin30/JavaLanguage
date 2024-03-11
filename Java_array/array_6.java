package javadatatypeproblems;

public class array_6 {
        public static void main(String[] args) {
            int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
            myNumbers[0][2] = 9;
            System.out.println(myNumbers[0][2]); // Outputs 9 instead of 3
        }
    }


