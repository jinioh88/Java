import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayEx {
    public static int sum;

    public static void main(String[] args) {
        String[] arr = {"오세진","김사나","둘리"};
        Stream<String> strStream = Arrays.stream(arr);
        strStream.forEach(s->System.out.print(s+","));

        IntStream stream = IntStream.rangeClosed(1,100);
        stream.forEach(a->sum+=a);
        System.out.println(sum);
    }
}
