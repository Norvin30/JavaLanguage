// delete

package Strings;

public class string_builder_4 {
    public static void main(String[] args){
        StringBuilder sb =new StringBuilder("Norvinn");

        sb.delete(5,6);
        System.out.println(sb);

        sb.delete(0,1);
        System.out.println(sb);
    }
}
