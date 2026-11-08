package ch14.sec03;

public class SynchronizedExample {

    static class Counter {
        private int count = 0;

        public synchronized void increase() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args)
            throws InterruptedException {

        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increase();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());
    }
}