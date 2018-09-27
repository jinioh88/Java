package patternIntro;

public class ToyDuck extends Duck {

    public ToyDuck() {
        flyable = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("장난감 오리!!");
    }

}
