import java.util.Arrays;

public class B007 {
    public static void main(String[] args) {
        Integer[] ages = {20,25,10,22,13,18,17,43,31};
        Arrays.stream(ages).filter(age -> age<20).forEach(age->
                                    System.out.format("Age %d!!! Cant't enter\n", age));

    }
}
