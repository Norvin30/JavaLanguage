public class javapractice_3 {
    public static void main(String[] args) {
        int[][] marks = {
                {50, 70},
                {80, 120},
                {90, 100}
        };
        for (int i = 0; i < marks.length; i++) {
            System.out.println();
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
        }
    }
}
