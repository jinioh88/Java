package thred;

import java.io.IOException;
import java.util.LinkedList;

public class TheradManager {
    public static void main(String[] args) {
        ResourceQueue queue = new ResourceQueue();
        Thread producer = new Thread(new Producer(queue),"producer");
        Thread consumer1 = new Thread(new Consumer(queue),"consumer1");
        Thread consumer2 = new Thread(new Consumer(queue),"consumer2");

        producer.start();
        consumer1.start();
        consumer2.start();
    }

    static class Producer implements Runnable {
        private ResourceQueue queue;

        public Producer(ResourceQueue queueu) {
            this.queue = queueu;
        }

        @Override
        public void run() {
            for(int i=0;i<10 && !Thread.interrupted();i++) {
                queue.put(i);
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }

    static class Consumer implements Runnable {
        private ResourceQueue queue;

        public Consumer(ResourceQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while(!Thread.interrupted()) {
                try {
                    Integer res = (Integer) queue.pop();
                    if(res!=null) {
                        System.out.println(Thread.currentThread().getName()+" pop : "+res);
                    }
                } catch(InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }

    static class ResourceQueue {
        private LinkedList<Object> jobs = new LinkedList<>();

        public synchronized void clear() {
            jobs.clear();
        }

        public synchronized Object pop() throws InterruptedException {
            Object o = null;
            if(jobs.isEmpty()) {
               this.wait();
            }
            o = jobs.removeFirst();
            return o;
        }

        public synchronized void put(Object o) {
            jobs.addLast(o);
            this.notify();
        }
    }
}
