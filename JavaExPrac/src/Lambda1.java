import java.util.Arrays;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("사나","쯔위","다현");

        for(String s : list)
            System.out.println(s);

        list.forEach(s-> System.out.println(s));
    }
}
