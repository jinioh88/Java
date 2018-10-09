package prac.ch02;

public class CycleMain {
    public  static void rideBycicle(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.printName();
    }
    public static void main(String[] args) {
        rideBycicle(new BicycleImpl());
        rideBycicle(new UnicycleImpl());
    }
}
