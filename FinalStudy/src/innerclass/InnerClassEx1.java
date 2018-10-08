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

    public Object getName() {
        return new Object() {
            public String toString() {
                return this.getClass().getName();
            }
        };
    }

    public static void main(String[] args) {
        InnerClassEx1 ex = new InnerClassEx1();
        ex.getName();
        InnerClassEx1.InnerClass innerEx = ex.new InnerClass();
        InnerClassEx1.InnerClass innerClass = ex.new InnerClass();
        InnerClass innerClass1 = ex.new InnerClass();
        innerClass.printInnerInfo();
        innerClass1.printInnerInfo();

        StaticInnerClass staticInnerClass = new InnerClassEx1.StaticInnerClass();
        staticInnerClass.printHash();
    }

    static class  StaticInnerClass {
        private int shashCode;

        public StaticInnerClass() {
            this.shashCode = System.identityHashCode(this);
        }

        public void printHash() {
            System.out.println(this.shashCode);
        }
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
