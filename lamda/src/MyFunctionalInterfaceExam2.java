public class MyFunctionalInterfaceExam2 {
    public int outterField = 10;
    // 클래스 멤버 사용
    class Inner {
        int innerField = 20;

        void method() {
            MyFunctionlInterface f1 = () -> {
                System.out.println("outField : "+ outterField);
                System.out.println("outter this : "+ MyFunctionalInterfaceExam2.this.outterField);

                System.out.println("innerField : "+innerField);
                System.out.println("inner : "+this.innerField);
            };
            f1.method();
        }
    }

    public static void main(String[] args) {
        MyFunctionlInterface2 fi;


        fi = (x) -> {
          int result = x * 5;
          System.out.println(result);
        };

        fi.method(2);

        fi = (x) -> System.out.println(x*6);
        fi.method(2);

        fi = x -> System.out.println(x*7);
        fi.method(2);

        // 리턴값 있는 람다식
        MyFunctionlInterface3 f3 = (x,y) -> {
          int result = x+y;
          return result;
        };
        System.out.println(f3.method(1,2));

        f3 = (x,y) -> {return x+y;};
        System.out.println(f3.method(1,2));

        f3 = (x,y) -> sum(x,y);


    }

    public static int sum(int a, int b) {
        return a+b;
    }
}
