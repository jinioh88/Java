package patternIntro;

import patternIntro.Duck;
import patternIntro.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyable = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallarDuck display!!");
    }

}
