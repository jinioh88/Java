package prac.ch02;

public class BicycleImpl implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }

    public BicycleImpl() {
    }
}
