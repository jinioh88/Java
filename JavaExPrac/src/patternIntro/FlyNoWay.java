package patternIntro;

public class FlyNoWay implements Flyable {
    @Override
    public void fly() {
        System.out.println("날지 못한다!");
    }
}
