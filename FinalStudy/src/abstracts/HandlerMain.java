package abstracts;

public class HandlerMain {
    public static void main(String[] args) {
        IntegerHandler integerHandler = new IntegerHandler();
        System.out.println(integerHandler.getRangeInfo());

        LongHandler longHandler = new LongHandler();
        System.out.println(longHandler.getRangeInfo());
    }
}
