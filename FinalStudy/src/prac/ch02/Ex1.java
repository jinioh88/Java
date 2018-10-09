package prac.ch02;

public class Ex1 {
    int i;
    char c;
    static int si;

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();

        Ex1 ex2 = new Ex1();
        Ex1.si = 10;
        System.out.println(ex1.si);

    }
}
