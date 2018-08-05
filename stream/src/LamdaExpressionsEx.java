import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionsEx {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("오세진",100), new Student("김사나",95));

        Stream<Student> stream = list.stream();
        stream.forEach(student -> {
            String name = student.getName();
            int score = student.getScore();
            System.out.println(name + " : "+score);
        });
    }
}
