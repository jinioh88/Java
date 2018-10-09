package prac.ch02;

public class UnicycleImpl implements CycleFactory {
    public UnicycleImpl() {
    }

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
