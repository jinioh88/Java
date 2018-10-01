package ch10;

public class Outer1 {
    class Innier1 {
        public Innier1() {}
    }

    public Innier1 inn() {
        System.out.println("내부클래스 생성!!");
        return new Innier1();
    }

    public static void main(String[] args) {
        Outer1 out1 = new Outer1();
        Outer1.Innier1 in1 = out1.inn();
    }
}
