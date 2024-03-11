
public class array_3 {
    public static void main(String[] args){
        // 2D array first type of representation of elaements

        String[][] letters= {{"a","b","c"},{"d", "e","f"}, {"g","h","i"}};

        letters[0][0] = "a";
        letters[0][1] = "b";
        letters[0][2] = "c";
        letters[1][0] = "d";
        letters[1][1] = "e";
        letters[1][2] = "f";
        letters[2][0] = "g";
        letters[2][1] = "h";
        letters[2][2] = "i";

        for (int i =0; i< letters.length; i++){
            System.out.println();
            for (int j=0; j< letters[i].length; j++){
                System.out.print(letters[i][j]+" ");
            }
        }
    }
}
