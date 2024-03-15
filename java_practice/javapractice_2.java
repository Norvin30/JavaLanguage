import java.util.Arrays;
public class javapractice_2 {
    public static void main(String[] args) {
        int[] marks = {100, 90, 80, 70};

        System.out.println("Marks before sorting:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks); // Sorting the array
        System.out.println("Marks after sorting:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
