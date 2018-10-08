package thred;

public class ThreadEx2 implements Runnable {
    private int res = 0;

    public static void main(String[] args) {
        ThreadEx2 ex = new ThreadEx2();
        Thread th1 = new Thread(ex);
        Thread th2 = new Thread(ex);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(ex.res);
    }

    private void sum() {
        Object obj= new Object();
        synchronized (obj) {
            for(int i=0;i<1000;i++) {
                res++;
            }
        }
    }

    @Override
    public void run() {
        sum();
    }
}
