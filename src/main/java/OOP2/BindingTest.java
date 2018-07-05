package OOP2;

class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        Child2 c2 = new Child2();

        System.out.println(p.x);
        p.method();

        System.out.println();

        System.out.println(c.x);
        c.method();

        Parent[] p2 = new Parent[10];
        p2[0] = c;
        p2[1] = c2;
    }
}

class Parent {
    int x = 100;

    void method(){
        System.out.println("Parent method...");
    }
}

class Child extends Parent {
    int x = 200;

    // 오버라이딩
    void method() {
        System.out.println("Child method...");
        System.out.println(super.x);
    }
}

class Child2 extends Parent {
    int x = 300;

    // 오버라이딩
    void method() {
        System.out.println("Child2 method...");
        System.out.println(super.x);
    }
}
