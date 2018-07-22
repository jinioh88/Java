package OOP2;

public class CastingTest {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        ((FireEngine) car).water(); // 형변환 해야 함.
        fe2 = (FireEngine) car;  // 업케스팅
        fe2.water();
    }
}

class Car {
    String color;
    int cc;

    void drive() {
        System.out.println("car go");
    }

    void stop() {
        System.out.println("Car strop!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("Water push!");
    }
}
