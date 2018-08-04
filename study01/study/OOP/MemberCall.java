package OOP;

class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    // static int cv2 = iv;  // 클래스 변수는 인스턴 수 변수 대입 못한다.
    static int cv2 = new MemberCall().iv; // 객체를 생성해 사용해야 한다.

    static void staticMethod(){
        System.out.println(cv);
        // System.out.println(iv);  // 인스턴스 변수를 상요 못한다 클래스 메서드는...
    }
}
