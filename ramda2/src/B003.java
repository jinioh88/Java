public class B003 {
    public static void main(String[] args) {
        MyFunctionalInterface myInterface = (a) ->  a*a;
        int b = myInterface.runSomething(5);
        System.out.println(b);
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    public abstract int runSomething(int n);
}
