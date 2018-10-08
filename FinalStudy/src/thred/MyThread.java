package thred;

public class MyThread implements Runnable {
    private Object obj = new Object();
    @Override
    public void run() {
        while(!Thread.interrupted()) {
            synchronized (obj){

                System.out.println("is running...");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println("terminated....");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyThread());
        t.start();

        Thread.sleep(50);

        t.interrupt();
    }
}
