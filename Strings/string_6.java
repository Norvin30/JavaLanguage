package Strings;

public class string_6 {
    public static void main(String[] args){
        String name1 = "Norvin";
        String name2 = "Tony";

        //three cases in compareTo function
        // 1) s1>s2:+ve value
        // 2) s1==s2:0
        // 3) s1<s2:-ve value

        if (name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else {
            System.out.println("String are not equal");
        }

    }
}
