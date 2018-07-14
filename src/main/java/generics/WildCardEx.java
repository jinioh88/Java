package generics;

import javafx.concurrent.Worker;

import java.util.Arrays;

public class WildCardEx {
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " 수강생 : "+Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course) {

    }

    public static void registerCouseWorker(Course<? super Worker> couse) {

    }
    public static void main(String[] args) {

    }
}
