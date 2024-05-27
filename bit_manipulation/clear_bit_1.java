package bit_manipulation;

public class clear_bit_1 {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notbitMask = ~(bitMask);

        int newNumber = notbitMask & n;
        System.out.println(newNumber);
    }
}
