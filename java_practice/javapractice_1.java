public class javapractice_1 {
    public static void main(String[] args){
        /*
        int maths  = 67;
        int physics  = 97;
        int biology  = 87;
        int chemistry = 47;
        */
        // How to store these marks in a single list.
        // for that we use arrays in java

        int[]  marks = new int[4];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 70;

        for (int i = 0 ; i< marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
