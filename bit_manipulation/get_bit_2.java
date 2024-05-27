package bit_manipulation;

public class get_bit_2 {
    public static void main(String[] args){
        int n =5;
        int pos = 3;
        int bitMask = 1<<pos;

        if ((bitMask & n ) == 0){
            System.out.println("bit was zero");
        }else {
            System.out.println("bit was one");
        }
    }
}
