package OOP;

class Tv{
    // 멤버 변수
    String color;
    boolean power;
    int channel;

    // 메서드
    void power(){ power = !power;}
    void channelUp(){ channel++;}
    void channelDown(){ channel--;}
}

public class TvTest {
    public static void main(String[] args) {
        Tv t1 = new Tv();  // t1 참조 변수에 Tv인스턴스만들고 주소 대입.
        Tv t2 = new Tv();
        t1.channel = 7;

        Tv[] tvArr = new Tv[2];  // 객체 배열.
        tvArr[0] = new Tv();
        tvArr[1] = new Tv();

        Tv[] tvArr2 = {new Tv(),new Tv()};
    }
}

