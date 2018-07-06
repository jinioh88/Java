package OOP2;

public class TVCR extends Tv1 implements IVCR {

    VCR vcr = new VCR();

    public void play() {
        vcr.play();
    }

    public void stop() {
        vcr.stop();
    }

    public void reset() {
        vcr.reset();
    }

    public int getCounter() {
        return vcr.getCounter();
    }

    public void setCounter(int counter) {
        vcr.setCounter(counter);
    }
}
