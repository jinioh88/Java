package OOP;

class MyMath {
    // 인스턴스 변수
    long a, b;

    // 인스턴스 함수
    // 인스턴스 변수를 활용하므로 매개변수가 필요 없다.
    long add() { return a+b; }

    // 클래스 함수
    static long add(long a, long b) {
        return a+b;
    }
}

class MyMathTest {
    public static void main(String[] args) {
        // 클래스 함수라 클래스이름.함수명 호출  가능
        System.out.println(MyMath.add(100L,200L));

        // 인스턴수 함수 후출 과정.
        MyMath mm = new MyMath();
        mm.a = 10;
        mm.b = 20;
        System.out.println(mm.add());
    }
}
