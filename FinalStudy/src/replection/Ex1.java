package replection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        String str = new String();
        WorkVal val = new WorkVal();
        Class clazz1 = str.getClass();
        Class clazz2 = val.getClass();

        Class<String> clazz3 = String.class;
        Class clazz4 = WorkVal.class;

        Class clazz5 = Class.forName("java.lang.String");

        Constructor<String> constructor = clazz3.getConstructor(String.class);

        System.out.println(System.identityHashCode(clazz1));
        System.out.println(System.identityHashCode(clazz2));
        System.out.println(System.identityHashCode(clazz3));
        System.out.println(System.identityHashCode(clazz4));
        System.out.println(System.identityHashCode(clazz5));

        System.out.println("=====");
        Method[] methods = clazz4.getMethods();

        for(Method m : methods) {
            System.out.println(m);
        }
    }
}

class WorkVal {
    private int n;

    public void init() {

    }

    public void printWork() {

    }
}
