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
        OOP2.Tv t1 = new OOP2.Tv();  // t1 참조 변수에 Tv인스턴스만들고 주소 대입.
        OOP2.Tv t2 = new OOP2.Tv();
        t1.channel = 7;

        OOP2.Tv[] tvArr = new OOP2.Tv[2];  // 객체 배열.
        tvArr[0] = new OOP2.Tv();
        tvArr[1] = new OOP2.Tv();

        OOP2.Tv[] tvArr2 = {new OOP2.Tv(),new OOP2.Tv()};
    }
}

