import java.util.Arrays;
import java.util.List;

public class MapAndReduceEx {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("오세진",100),
                new Student("김사나",95),
                new Student("홍길동",90));

        double avg = list.stream().mapToInt(Student :: getScore).average().getAsDouble();

        System.out.println(avg);
    }
}
