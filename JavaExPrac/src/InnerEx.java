public class InnerEx {
    private String outerFiled = "outer";

    class Inner {
        private String innerFiled = "inner";

        public String innerMethod() {
            outerMethod();
            return outerFiled + innerFiled;
        }
    }

    public void outer(String message) {
        Runnable runnable = () -> System.out.println("메시지 : "+message);
    }

    static class Inner2 {
        private String filed2 = "nested";

        public String nestedMethod() {
            return filed2;
        }
    }

    public void outerMethod() {
        Inner inner = new Inner();
        System.out.println(inner.innerFiled);
        System.out.println(inner.innerMethod());
    }
}
