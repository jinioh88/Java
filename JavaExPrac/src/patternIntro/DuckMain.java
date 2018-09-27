package patternIntro;

public class DuckMain {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.setFlyable(new FlyRocketPowered());
        mallard.performFly();

        Duck toyDuck = new ToyDuck();
        toyDuck.performFly();
    }
}
