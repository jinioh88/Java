import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SteramEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Scala","Javascript","Groovy");
        Stream<String> s1 = list.stream();
        s1.filter(s->s.startsWith("J")).map(s->s.toUpperCase()).sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
        boolean boolRes = list.stream().anyMatch(s->s.startsWith("J"));
        System.out.println(boolRes);

        Map<String,String> map = new HashMap<>();
        Stream<Map.Entry<String,String>> s2 = map.entrySet().stream();

        IntStream intStream = IntStream.of(1,2,3);
        int[] array1 = {1,2,3};
        IntStream intStream1 = IntStream.of(array1);

        IntStream intStream2 = IntStream.range(1,10);
        int sum = intStream2.sum();
        System.out.println(sum);
        IntStream intStream3 = IntStream.rangeClosed(1,10);
//        IntStream stream = IntStream.concat(intStream2,intStream3);
//        stream.forEach(System.out::println);

//        Stream<String> stream = Stream.of("Java","Scala","Javascript","Groovy");
//        IntStream intStream4 = stream.mapToInt(s->s.length());
//        intStream4.forEach(System.out::println);

        List<String> list1 = Arrays.asList("Java","Scala","Javascript","Groovy","Java");
        Stream<String> stream1 = list1.stream();
        long count1 = stream1.count();
        System.out.println(count1);

        System.out.println(list.stream().distinct().count());
    }
}
