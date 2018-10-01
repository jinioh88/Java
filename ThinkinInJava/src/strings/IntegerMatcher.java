package strings;

public class IntegerMatcher {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d"));
    }
}
