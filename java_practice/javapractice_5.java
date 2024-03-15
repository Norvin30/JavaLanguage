// Sum of  float elements of an Array.

public class javapractice_5 {
    public static void main(String[] args){
        float[] marks = {89.5f,60.7f,76.8f,45.7f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The sum of element:"+ sum);
    }
}
