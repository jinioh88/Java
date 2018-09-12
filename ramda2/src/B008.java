import java.util.Arrays;
import java.util.function.BiFunction;

public class B008 {
    public static void main(String[] args) {
        Double[] nums = {1.0,4.0,9.0,16.0,25.0};

        System.out.println("=====Lamda=====");
        Arrays.stream(nums).map(num->Math.sqrt(num)).forEach(squrtNum-> System.out.println(squrtNum));

        System.out.println("===Method Reference===");
        Arrays.stream(nums).map(Math::sqrt).forEach(System.out::println);

        BiFunction<Integer, Integer, Integer> bip_lambda = (a,b) -> a.compareTo(b);
        BiFunction<Integer, Integer, Integer> bip_method_referecne = Integer::compareTo;

        System.out.println("==================");

        System.out.println(bip_lambda.apply(10,12));
        System.out.println(bip_method_referecne.apply(10,12));

    }
}
