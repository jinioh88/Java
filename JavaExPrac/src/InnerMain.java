public class InnerMain {
    public static void main(String[] args) {
        InnerEx ex = new InnerEx();
        InnerEx.Inner inner = ex.new Inner();

        InnerEx.Inner2 in2 = new InnerEx.Inner2();
    }
}
