package generics;


public class BoxExam {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("hello");
        String str = box.get();

        System.out.println(str);
    }
}
