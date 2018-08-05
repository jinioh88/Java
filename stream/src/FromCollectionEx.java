import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionEx {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("오세진",100),new Student("김사나",100),
                new Student("홍길동",90));

        Stream<Student> stream = list.stream();
        stream.forEach(s-> System.out.println(s.getName()));
    }
}
