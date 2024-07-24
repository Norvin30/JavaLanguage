package string_excercise_java;

public class ex1 {

    public static void main(String[] args) {

        String str = "Norvin Samson Anthony";

        System.out.println("Original String = " + str);

        int index1 = str.charAt(0);
        int index2 = str.charAt(20);

        System.out.println("The character at position 0 is " +
                (char)index1);
        System.out.println("The character at position 10 is " +
                (char)index2);
    }
}