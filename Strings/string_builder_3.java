// insert
package Strings;

public class string_builder_3 {
    public static void main(String[] args){
        StringBuilder  sb = new StringBuilder("Norvin");

        sb.insert(0,'N');
        System.out.println(sb);

        sb.insert(6,'n');
        System.out.println(sb);
    }
}
