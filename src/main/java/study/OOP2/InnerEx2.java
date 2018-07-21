package OOP2;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class InnerEx2 {
    class InstanceInner {}
    static class StaticInner {}

    InstanceInner iv = new InstanceInner();

    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        // 스태틱 멤버는 인스턴스 멤버에 접근 못ㅎ함
        //InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }

    void method() {
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }
}
