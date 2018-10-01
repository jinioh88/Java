package interfaces;

public class CycleMain {
    public static void rideCycle(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.ride();
    }

    public static void main(String[] args) {
        rideCycle(new BicycleFactory());
        rideCycle(new UnicycleFactory());
    }
}
