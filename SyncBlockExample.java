package ch14.sec03;

public class SyncBlockExample {

    private int count = 0;

    public void increase() {
        synchronized (this) {
            count++;
        }
    }

    public synchronized int getCount() {
        return count;
    }
}