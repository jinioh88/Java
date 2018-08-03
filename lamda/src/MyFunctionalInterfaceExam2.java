public class MyFunctionalInterfaceExam2 {
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
    }
}
