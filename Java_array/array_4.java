
public class array_4 {
    public static void main(String[] args){

        // 2D array seconf way  of representation of elaements

        String[][] letters= {
                {"a","b","c"},
                {"d", "e","f"},
                {"g","h","i"}
        };

        for (int i =0; i< letters.length; i++){
            System.out.println();
            for (int j=0; j< letters[i].length; j++){
                System.out.print(letters[i][j]+" ");
            }
        }
    }
}
