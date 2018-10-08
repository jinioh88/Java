package innerclass;

public class InnerClassEx1 {
    private int outerhashCode;
    private String outerClassname;
    private boolean isOuter;

    public InnerClassEx1() {
        outerClassname = this.getClass().getName();
        this.outerhashCode = System.identityHashCode(this);
        isOuter = true;
    }

    public static void main(String[] args) {
        InnerClassEx1 ex = new InnerClassEx1();
        InnerClassEx1.InnerClass innerEx = ex.new InnerClass();
        InnerClassEx1.InnerClass innerClass = ex.new InnerClass();
        InnerClass innerClass1 = ex.new InnerClass();
        innerClass.printInnerInfo();
        innerClass1.printInnerInfo();
    }

    class InnerClass {
        private int innerhashCode;
        public String innerClassname;
        static final boolean isInner = true;

        public InnerClass() {
            innerhashCode = System.identityHashCode(this);
            innerClassname = this.getClass().getName();
        }

        public void printOuterInfo() {
            System.out.println(outerClassname);
            System.out.println(outerhashCode);
        }

        public void printInnerInfo() {
            System.out.println(this.innerClassname);
            System.out.println(this.innerhashCode);
        }
    }
}
