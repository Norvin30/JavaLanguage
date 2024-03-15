// To check whether a element is present in the array.

public class javapractice_6 {
    public static void main(String[] args) {
        float[] marks = {89.5f, 60.7f, 76.8f, 45.7f};
        float num = 76.8f;
        boolean isInArray = false;
        for (float element : marks) {
            if(num==element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in array");
        } else {
            System.out.println("The value is not present in array");
        }
    }
}