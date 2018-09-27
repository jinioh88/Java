import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {

        String source = "A,B,C,";

        String[] str1 = source.split(",");
        System.out.println(Arrays.toString(str1));

        String[] str2 = source.split(",",2);
        System.out.println(Arrays.toString(str2));

        String[] str3 = source.split(",",-1);
        System.out.println(Arrays.toString(str3));

        String source2 = "Hello Wolrd.";
        String temp1 = source2.toUpperCase();
        System.out.println(temp1);
        temp1 = source2.toLowerCase();
        System.out.println(temp1);
    }

}
