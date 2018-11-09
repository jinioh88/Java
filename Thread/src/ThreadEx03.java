public class ThreadEx03 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx03();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) {
        if(balance>=money) {
            try{Thread.sleep(1000);} catch (InterruptedException e) {}
            balance -= money;
        }
    }
}

class RunnableEx03 implements Runnable {
    Account ac = new Account();

    @Override
    public void run() {
        while(ac.getBalance()>0) {
            int money = (int)(Math.random()*3 +1) + 100;
            ac.withdraw(money);
            System.out.println("balance:"+ac.getBalance());
        }
    }
}
