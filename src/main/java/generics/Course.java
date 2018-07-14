package generics;

public class Course<T> {
    private String name;
    private T[] students;

    public Course(String name, int capaciry) {
        this.name = name;
        this.students = (T[]) (new Object[capaciry]);
    }

    public String getName() {
        return name;
    }

    public T[] getStudents() {
        return students;
    }

    public void add(T t) {
        for(int i=0; i<students.length; i++) {
            if(students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }
}
