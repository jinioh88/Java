package patternIntro;

public abstract class Duck {
    Flyable flyable;

    public Duck() {
    }

    public void performFly() {
        flyable.fly();
    }

    public void quack() {
        System.out.println("꽥꽥");
    }
    public void swin() {
        System.out.println("오리가 수영");
    }

    public void setFlyable(Flyable fb) {
        flyable = fb;
    }

    abstract public void display();
}
