package prac.ch02;

public class Bicycle implements Cycle {
    Bicycle() {}

    @Override
    public void printName() {
        System.out.println("This is Bicycle");
    }
}
