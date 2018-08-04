public class MyFunctionalInterfaceExam {
    public static void main(String[] args) {
        MyFunctionlInterface fi;

        fi = ()->{
          String str = "method call...";
            System.out.println(str);
        };

        fi.method();

        fi = () -> {
            System.out.println("method2 call...");
        };
        fi.method();

        fi = () -> System.out.println("method3 call...");
        fi.method();
    }
}
