public class B004 {
    public static void main(String[] args) {
        MyFunctionalInterface mfi = a->a*a;

        doIt(mfi);
        System.out.println();
        doIt(a->a*a);
    }

    public static void doIt(MyFunctionalInterface mfi) {
        int b = mfi.runSomething(5);
        System.out.println(b);
    }
}
