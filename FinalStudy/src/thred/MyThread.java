package thred;

public class MyThread implements Runnable {
    @Override
    public void run() {
        while(true) {
            System.out.println("is running...");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
        System.out.println("end!");

        String thisThName = Thread.currentThread().getName();
        System.out.println(thisThName);

        String thisGName = Thread.currentThread().getThreadGroup().getName();
        System.out.println(thisGName);
    }
}
