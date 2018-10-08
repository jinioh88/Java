package abstracts;

public class LongHandler extends Abstracthandler {
    public static void main(String[] args) {
        LongHandler handler = new LongHandler();
        System.out.println(handler.getRangeInfo());
    }

    @Override
    public String getRangeInfo() {
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;

        String rt = "From : "+min+", To : "+max;
        return rt;
    }
}
