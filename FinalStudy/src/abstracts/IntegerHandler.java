package abstracts;

public class IntegerHandler extends Abstracthandler {
    public static void main(String[] args) {
        IntegerHandler handler = new IntegerHandler();
        System.out.println(handler.getRangeInfo());
    }

    @Override
    public String getRangeInfo() {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        String rt = "From : "+min+", To : "+max;
        return rt;
    }
}
