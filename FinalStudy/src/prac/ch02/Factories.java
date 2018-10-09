package prac.ch02;

import java.net.ServerSocket;

public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new FactoryImpl1());
        serviceConsumer(new FactoryImpl2());
    }
}

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Imple1 implements Service {
    Imple1() {}

    @Override
    public void method1() {
        System.out.println("Imel1 method1()");
    }

    @Override
    public void method2() {
        System.out.println("Impl1 method2()");
    }
}

class FactoryImpl1 implements ServiceFactory {
    FactoryImpl1() {}
    @Override
    public Service getService() {
        return new Imple1();
    }
}

class Imple2 implements Service {
    @Override
    public void method1() {
        System.out.println("impl2 method1()");
    }

    @Override
    public void method2() {
        System.out.println("impl2 method2()");
    }
}

class FactoryImpl2 implements ServiceFactory {
    FactoryImpl2() {}

    @Override
    public Service getService() {
        return new Imple2();
    }
}
